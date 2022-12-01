package com.github.margawron.census.world;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class FacilityControl extends CensusEvent {
    private WorldId worldId;
    private Long oldFactionId;
    private Long outfitId;
    private Long newFactionId;
    private Long facilityId;
    private String durationHeld;
    private Long zoneId;

    public WorldId getWorldId() {
        return worldId;
    }

    @JsonProperty("world_id")
    void setWorldId(WorldId worldId) {
        this.worldId = worldId;
    }

    public Long getOldFactionId() {
        return oldFactionId;
    }

    @JsonProperty("old_faction_id")
    void setOldFactionId(Long oldFactionId) {
        this.oldFactionId = oldFactionId;
    }

    public Long getOutfitId() {
        return outfitId;
    }

    @JsonProperty("outfit_id")
    void setOutfitId(Long outfitId) {
        this.outfitId = outfitId;
    }

    public Long getNewFactionId() {
        return newFactionId;
    }

    @JsonProperty("new_faction_id")
    void setNewFactionId(Long newFactionId) {
        this.newFactionId = newFactionId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    @JsonProperty("facility_id")
    void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public String getDurationHeld() {
        return durationHeld;
    }

    @JsonProperty("duration_held")
    void setDurationHeld(String durationHeld) {
        this.durationHeld = durationHeld;
    }

    public Long getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }
}
