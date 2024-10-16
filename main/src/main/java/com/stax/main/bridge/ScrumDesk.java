package com.stax.main.bridge;

public class ScrumDesk extends Desk {

    protected ScrumDesk(Theme theme) {
        super(theme);
    }

    @Override
    protected Theme getTheme() {
        return this.theme;
    }
}
