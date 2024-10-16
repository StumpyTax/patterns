package com.stax.main.bridge;

public class KanbanDesk extends Desk {

    protected KanbanDesk(Theme theme) {
        super(theme);
    }

    @Override
    protected Theme getTheme() {
        return this.theme;
    }
}
