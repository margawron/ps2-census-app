package com.github.margawron.census.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class GainExperience extends CensusEvent {
    private Long amount;
    private Long characterId;
    private Long experienceId;
    private Long loadoutId;
    private Long otherId;
    private Long teamId;
    private WorldId worldId;
    private Long zoneId;

    public Long getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getCharacterId() {
        return characterId;
    }

    @JsonProperty("character_id")
    void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public Long getExperienceId() {
        return experienceId;
    }

    @JsonProperty("experience_id")
    void setExperienceId(Long experienceId) {
        this.experienceId = experienceId;
    }

    public Long getLoadoutId() {
        return loadoutId;
    }

    @JsonProperty("loadout_id")
    void setLoadoutId(Long loadoutId) {
        this.loadoutId = loadoutId;
    }

    public Long getOtherId() {
        return otherId;
    }

    @JsonProperty("other_id")
    void setOtherId(Long otherId) {
        this.otherId = otherId;
    }

    public Long getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    void setTeamId(Long teamId) {
        this.teamId = teamId;
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
