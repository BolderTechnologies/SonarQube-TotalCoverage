/*
 * Copyright 2016 BolderTechnologies
 */
package circle;

import api.Position;
import api.Shape;

public class Circle implements Shape {

    private static final String NAME = "Circle";

    private final int radius;

    private final Position position;

    public Circle(final int radius, final Position position) {
        this.radius = radius;
        this.position = position;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
