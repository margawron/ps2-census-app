package com.github.margawron

import org.http4k.client.WebsocketClient
import org.http4k.core.Uri
import org.http4k.websocket.WsMessage
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.concurrent.atomic.AtomicInteger
import mu.KotlinLogging
import java.lang.Exception
import java.time.LocalDateTime
import kotlin.math.log

private val logger = KotlinLogging.logger{ }

fun main(args: Array<String>) {
    val serviceId: String = System.getenv("serviceId")
    val censusApiUri = Uri.of("wss://push.planetside2.com/streaming?environment=ps2&service-id=s:$serviceId")
    val receiveAllMessagesRequest = """
        {
        	"service":"event",
        	"action":"subscribe",
        	"characters":["all"],
        	"worlds":["all"],
        	"eventNames":["all"]
        }
    """.trimIndent()
    val websocket = WebsocketClient.nonBlocking(censusApiUri) {
        it.run {
            send(WsMessage(receiveAllMessagesRequest))
        }
    }

    val messagesPerSecond = AtomicInteger(0)
    val debugOutputFile = FileOutputStream("output_${LocalDateTime.now()}.json")
    val printerWriter = PrintWriter(debugOutputFile)
    val censusEventConverter = CensusEventConverter()
    websocket.onMessage {
        messagesPerSecond.incrementAndGet()
        val bodyString = it.bodyString()
        try {
            val event = censusEventConverter.fromString(bodyString)
        } catch (e: Exception){
            printerWriter.write(e.message!!)
            printerWriter.write("\n\n")
        }
    }

    var iterations = 0
    while (iterations < 100){
        Thread.sleep(1_000)
        logger.info { "$iterations -> Processed ${messagesPerSecond.getAndSet(0)}" }
        iterations++
    }
    websocket.close()
//    printerWriter.write("]")

}