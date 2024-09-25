package com.stax.main.prototype;

public class TaskGenerator {

    private final Task prototype;

    public TaskGenerator(Task prototype) {
        this.prototype = prototype;
    }

    public Task copy(){
        return this.prototype.copy();
    }
}
