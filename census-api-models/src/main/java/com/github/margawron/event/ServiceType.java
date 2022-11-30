package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ServiceType {
    @JsonProperty("event")      EVENT,
    @JsonProperty("push")       PUSH,
}
