package com.github.margawron.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public final class SubscriptionServiceEvent implements ServiceEvent {
    private Map<String, Object> subscriptions;

    public Map<String, Object> getSubscriptions() {
        return subscriptions;
    }

    @JsonProperty("subscription")
    void setSubscriptions(Map<String, Object> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
