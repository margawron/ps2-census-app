package com.github.margawron;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.margawron.event.ServiceEvent;

public class CensusEventConverter {

    private final ObjectMapper objectMapper;

    public CensusEventConverter() {
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    public ServiceEvent fromString(String event) throws JsonProcessingException {
        return objectMapper.readValue(event, ServiceEvent.class);
    }
}
