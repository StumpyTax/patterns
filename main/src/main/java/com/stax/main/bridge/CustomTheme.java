package com.stax.main.bridge;

import java.awt.Color;
import java.util.Map;
import java.util.UUID;

public class CustomTheme implements Theme {

    @Override
    public Background getBackGround() {
        return null;
    }

    @Override
    public Map<UUID, Color> getTasksColorsByPriority() {
        return null;
    }
}
