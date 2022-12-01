package com.github.margawron.census;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.margawron.census.character.*;
import com.github.margawron.census.player.PlayerLogin;
import com.github.margawron.census.player.PlayerLogout;
import com.github.margawron.census.world.ContinentLock;
import com.github.margawron.census.world.ContinentUnlock;
import com.github.margawron.census.world.FacilityControl;
import com.github.margawron.census.world.MetagameEvent;

import java.time.Instant;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "event_name"
)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "AchievementEarned", value = AchievementEarned.class),
        @JsonSubTypes.Type(name = "BattleRankUp", value = BattleRankUp.class),
        @JsonSubTypes.Type(name = "Death", value = Death.class),
        @JsonSubTypes.Type(name = "GainExperience", value = GainExperience.class),
        @JsonSubTypes.Type(name = "ItemAdded", value = ItemAdded.class),
        @JsonSubTypes.Type(name = "PlayerFacilityCapture", value = PlayerFacilityCapture.class),
        @JsonSubTypes.Type(name = "PlayerFacilityDefend", value = PlayerFacilityDefend.class),
        @JsonSubTypes.Type(name = "SkillAdded", value = SkillAdded.class),
        @JsonSubTypes.Type(name = "VehicleDestroy", value = VehicleDestroy.class),

        @JsonSubTypes.Type(name = "PlayerLogin", value = PlayerLogin.class),
        @JsonSubTypes.Type(name = "PlayerLogout", value = PlayerLogout.class),

        @JsonSubTypes.Type(name = "ContinentLock", value = ContinentLock.class),
        @JsonSubTypes.Type(name = "ContinentUnlock", value = ContinentUnlock.class),
        @JsonSubTypes.Type(name = "FacilityControl", value = FacilityControl.class),
        @JsonSubTypes.Type(name = "MetagameEvent", value = MetagameEvent.class),
})
public abstract class CensusEvent {

    private CensusEventName eventName;
    private Instant timestamp;

    public CensusEventName getEventName() {
        return eventName;
    }

    @JsonProperty("event_name")
    void setEventName(CensusEventName eventName) {
        this.eventName = eventName;
    }


    public Instant getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    void setTimestamp(String timestamp) {
        this.timestamp = Instant.ofEpochMilli(Long.parseLong(timestamp));
    }
}
