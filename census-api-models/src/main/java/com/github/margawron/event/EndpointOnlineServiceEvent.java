package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class EndpointOnlineServiceEvent extends AbstractServiceEvent {
    private String detail;
    private Boolean online;


    public String getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getOnline() {
        return online;
    }

    @JsonProperty("online")
    void setOnline(Boolean online) {
        this.online = online;
    }
}
