package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;

public final class PayloadServiceEvent extends AbstractServiceEvent {
    private CensusEvent payload;

    public CensusEvent getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    void setPayload(CensusEvent payload) {
        this.payload = payload;
    }
}
