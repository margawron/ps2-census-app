package com.github.margawron.census.character;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.margawron.census.CensusEvent;
import com.github.margawron.census.common.WorldId;

public class VehicleDestroy extends CensusEvent {
    private Long attackerCharacterId;
    private Long attackerLoadoutId;
    private Long attackerVehicleId;
    private Long attackerWeaponId;
    private Long characterId;
    private Long facilityId;
    private Long factionId;
    private Long vehicleId;
    private WorldId worldId;
    private Long zoneId;

    public Long getAttackerCharacterId() {
        return attackerCharacterId;
    }

    @JsonProperty("attacker_character_id")
    void setAttackerCharacterId(Long attackerCharacterId) {
        this.attackerCharacterId = attackerCharacterId;
    }

    public Long getAttackerLoadoutId() {
        return attackerLoadoutId;
    }

    @JsonProperty("attacker_loadout_id")
    void setAttackerLoadoutId(Long attackerLoadoutId) {
        this.attackerLoadoutId = attackerLoadoutId;
    }

    public Long getAttackerVehicleId() {
        return attackerVehicleId;
    }

    @JsonProperty("attacker_vehicle_id")
    void setAttackerVehicleId(Long attackerVehicleId) {
        this.attackerVehicleId = attackerVehicleId;
    }

    public Long getAttackerWeaponId() {
        return attackerWeaponId;
    }

    @JsonProperty("attacker_weapon_id")
    void setAttackerWeaponId(Long attackerWeaponId) {
        this.attackerWeaponId = attackerWeaponId;
    }

    public Long getCharacterId() {
        return characterId;
    }

    @JsonProperty("character_id")
    void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    @JsonProperty("facility_id")
    void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getFactionId() {
        return factionId;
    }

    @JsonProperty("faction_id")
    void setFactionId(Long factionId) {
        this.factionId = factionId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    @JsonProperty("vehicle_id")
    void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
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
