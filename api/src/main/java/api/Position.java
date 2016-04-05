/*
 * Copyright 2016 BolderTechnologies
 */
package api;

/**
 * Where is something located
 * 
 * @author boldertech
 */
public class Position {
    final int x;
    final int y;

    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }
}
