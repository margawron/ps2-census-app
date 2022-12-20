package com.github.margawron.census.world;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class MetagameEvent extends CensusEvent {
    private WorldId worldId;
    private String experienceBonus;
    private String factionNc;
    private String factionTr;
    private String factionVs;
    private String metagameEventId;
    private String metagameEventState;
    private Long zoneId;

    public WorldId getWorldId() {
        return worldId;
    }

    @JsonProperty("world_id")
    void setWorldId(WorldId worldId) {
        this.worldId = worldId;
    }

    public String getExperienceBonus() {
        return experienceBonus;
    }

    @JsonProperty("experience_bonus")
    void setExperienceBonus(String experienceBonus) {
        this.experienceBonus = experienceBonus;
    }

    public String getFactionNc() {
        return factionNc;
    }

    @JsonProperty("faction_nc")
    void setFactionNc(String factionNc) {
        this.factionNc = factionNc;
    }

    public String getFactionTr() {
        return factionTr;
    }

    @JsonProperty("faction_tr")
    void setFactionTr(String factionTr) {
        this.factionTr = factionTr;
    }

    public String getFactionVs() {
        return factionVs;
    }

    @JsonProperty("faction_vs")
    void setFactionVs(String factionVs) {
        this.factionVs = factionVs;
    }

    public String getMetagameEventId() {
        return metagameEventId;
    }

    @JsonProperty("metagame_event_id")
    void setMetagameEventId(String metagameEventId) {
        this.metagameEventId = metagameEventId;
    }

    public String getMetagameEventState() {
        return metagameEventState;
    }

    @JsonProperty("metagame_event_state")
    void setMetagameEventState(String metagameEventState) {
        this.metagameEventState = metagameEventState;
    }

    public Long getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }
}
