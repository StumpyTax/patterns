package com.stax.main.bridge;

import java.awt.Color;
import java.util.Map;
import java.util.UUID;

public interface Theme {

    Background getBackGround();

    Map<UUID, Color> getTasksColorsByPriority();

}
