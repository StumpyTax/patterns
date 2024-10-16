package com.stax.main.bridge;

public abstract class Desk {

    protected final Theme theme;

    protected Desk(Theme theme){
        this.theme = theme;
    }

    protected abstract Theme getTheme();
}
