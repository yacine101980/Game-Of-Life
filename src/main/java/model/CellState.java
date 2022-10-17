package model;

import javafx.scene.paint.Color;

/**
 * {@link CellState} instances represent the possible states of a {@link CellState}.
 */
public enum CellState {
    redALIVE(true, Color.RED),
    blueALIVE(true, Color.BLUE),
    DEAD(false, Color.WHITE);

    public final boolean isAlive;
    public final Color color;

    CellState(boolean isAlive, Color color) {
        this.isAlive = isAlive;
        this.color = color;
    }
}
