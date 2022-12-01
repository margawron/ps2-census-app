package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public final class MiscHelpServiceEvent implements ServiceEvent {
    private Map<String, Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    @JsonProperty("send this for help")
    void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
