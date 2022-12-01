package com.github.margawron.event;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(PayloadServiceEvent.class),
        @JsonSubTypes.Type(ConnectedServiceEvent.class),
        @JsonSubTypes.Type(EndpointOnlineServiceEvent.class),
        @JsonSubTypes.Type(MiscHelpServiceEvent.class),
        @JsonSubTypes.Type(SubscriptionServiceEvent.class),
})
public sealed interface ServiceEvent permits AbstractServiceEvent, MiscHelpServiceEvent, SubscriptionServiceEvent {
}
