package com.stax.main.prototype;

import lombok.Getter;

@Getter
public class SimpleTask extends Task {

    private SimpleTask(String name, String description, String numberPrefix,
                         PriorityLevel level) {
        super(name, description, numberPrefix, level);
    }

    public static SimpleTask mediumTask(String name, String description, String numberPrefix) {
        return new SimpleTask(name, description,numberPrefix, PriorityLevel.MEDIUM);
    }

    @Override
    public Task copy() {
        return new SimpleTask(name,description,numberPrefix,level);
    }
}
