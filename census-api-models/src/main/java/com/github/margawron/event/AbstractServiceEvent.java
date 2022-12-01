package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract sealed class AbstractServiceEvent implements ServiceEvent
        permits ConnectedServiceEvent, EndpointOnlineServiceEvent, HeartbeatServiceEvent, PayloadServiceEvent {
    private ServiceType service;
    private ServiceEventType type;


    public ServiceType getService() {
        return service;
    }

    @JsonProperty("service")
    void setService(ServiceType service) {
        this.service = service;
    }

    public ServiceEventType getType() {
        return type;
    }

    @JsonProperty("type")
    void setType(ServiceEventType type) {
        this.type = type;
    }
}
