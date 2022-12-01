package com.github.margawron.census.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class AchievementEarned extends CensusEvent {

    private Long characterId;
    private WorldId worldId;
    private Long achievementId;
    private Long zoneId;


    public Long getCharacterId() {
        return characterId;
    }

    @JsonProperty("character_id")
    void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public WorldId getWorldId() {
        return worldId;
    }

    @JsonProperty("world_id")
    void setWorldId(WorldId worldId) {
        this.worldId = worldId;
    }

    public Long getAchievementId() {
        return achievementId;
    }

    @JsonProperty("achievement_id")
    void setAchievementId(Long achievementId) {
        this.achievementId = achievementId;
    }

    public Long getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }
}
