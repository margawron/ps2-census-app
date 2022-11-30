package com.github.margawron.census.common;

public enum WorldId {
    CONNERY(1),
    MILLER(10),
    COBALT(13),
    EMERALD(17),
    JAEGER(19),
    SOLTECH(40),
    ;

    private final int worldId;

    WorldId(int worldId) {
        this.worldId = worldId;
    }

    public int getWorldId() {
        return worldId;
    }
}
