package com.github.margawron.census.character;

import com.github.margawron.census.CensusEvent;

import java.time.Instant;

public class Death extends CensusEvent {

    private String attackerCharacterId;
    private String attackerFireModeId;
    private String attackerLoadoutId;
    private String attackerVehicleId;
    private String attackerWeaponId;
    private String characterId;
    private String characterLoadoutId;
    private Boolean isCritical;
    private Boolean isHeadshot;
    private Instant timestamp;
    private String vehicleId;
    private String worldId;
    private String zoneId;
}
