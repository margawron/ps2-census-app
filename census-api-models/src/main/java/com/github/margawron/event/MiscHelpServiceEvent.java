package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public final class MiscHelpServiceEvent implements ServiceEvent {
    private Map<String, String> info;

    public Map<String, String> getInfo() {
        return info;
    }

    @JsonProperty("send this for help")
    void setInfo(Map<String, String> info) {
        this.info = info;
    }
}
