package com.github.margawron.census.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class BattleRankUp extends CensusEvent {

    private String battleRank;
    private Long characterId;
    private WorldId worldId;
    private Long zoneId;

    public String getBattleRank() {
        return battleRank;
    }

    @JsonProperty("battle_rank")
    void setBattleRank(String battleRank) {
        this.battleRank = battleRank;
    }

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

    public Long getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }
}
