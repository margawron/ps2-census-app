package com.github.margawron.census.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;

import java.time.Instant;

public class AchievementEarned extends CensusEvent {

    private String characterId;
    private Instant timestamp;
    private String worldId;
    private String achievementId;
    private String zoneId;


    public String getCharacterId() {
        return characterId;
    }

    @JsonProperty("character_id")
    void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    void setTimestamp(String timestamp) {
        this.timestamp = Instant.ofEpochMilli(Integer.parseInt(timestamp));
    }

    public String getWorldId() {
        return worldId;
    }

    @JsonProperty("world_id")
    void setWorldId(String worldId) {
        this.worldId = worldId;
    }

    public String getAchievementId() {
        return achievementId;
    }

    @JsonProperty("achievement_id")
    void setAchievementId(String achievementId) {
        this.achievementId = achievementId;
    }

    public String getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
}
