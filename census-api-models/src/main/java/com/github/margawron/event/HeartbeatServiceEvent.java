package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public final class HeartbeatServiceEvent extends AbstractServiceEvent {
    private Map<String, Boolean> heartbeatInfo;

    public Map<String, Boolean> getHeartbeatInfo() {
        return heartbeatInfo;
    }

    @JsonProperty("online")
    void setHeartbeatInfo(Map<String, Boolean> heartbeatInfo) {
        this.heartbeatInfo = heartbeatInfo;
    }
}
