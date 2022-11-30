package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class ConnectedServiceEvent extends AbstractServiceEvent {
    private Boolean isConnected;

    public Boolean getConnected() {
        return isConnected;
    }

    @JsonProperty("connected")
    void setConnected(Boolean connected) {
        isConnected = connected;
    }
}
