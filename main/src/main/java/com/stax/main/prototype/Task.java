package com.stax.main.prototype;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Task {

    protected String name;

    protected String description;

    protected String numberPrefix;

    protected PriorityLevel level;

    public abstract Task copy();
}
