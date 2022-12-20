package com.github.margawron.census.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CensusBoolean {
    @JsonProperty("1") TRUE(true),
    @JsonProperty("0") FALSE(false);

    private final boolean value;

    CensusBoolean(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }
}
