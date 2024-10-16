package com.stax.main.bridge;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RedTheme implements Theme {

    @Override
    public Background getBackGround() {
        return new Background(Color.RED, null);
    }

    @Override
    public Map<UUID, Color> getTasksColorsByPriority() {
        return new HashMap.of(UUID.randomUUID(), Color.RED);
    }
}
