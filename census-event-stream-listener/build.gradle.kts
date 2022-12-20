plugins {
    kotlin("jvm") version "1.7.22"
    id("java")
}

group = "com.github.margawron"
version = "0.0.1"

repositories {
    mavenCentral()
    mavenLocal()
}

val http4kVersion by extra("4.34.2.0")
val junitVersion by extra("5.9.0")
val censusModelsVersion by extra("0.0.1")

val slf4jVersion by extra("2.0.4")
val microUtilsVersion by extra("3.0.4")
val logbackVersion by extra("1.4.5")

dependencies {
    // Census mappings
    implementation("com.github.margawron:census-api-models:$censusModelsVersion")

    // Logging
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("io.github.microutils:kotlin-logging-jvm:$microUtilsVersion")
    implementation("ch.qos.logback:logback-core:$logbackVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    // Http4k
    implementation("org.http4k:http4k-core:$http4kVersion")
    implementation("org.http4k:http4k-server-netty:$http4kVersion")
    implementation("org.http4k:http4k-client-websocket:$http4kVersion")

    // JUnit
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}