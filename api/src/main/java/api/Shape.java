/*
 * Copyright 2016 BolderTechnologies
 */
package api;

public interface Shape {
    /**
     * The name of the shape, ie Circle, Square, Triangle
     */
    String getName();

    /**
     * The current area the shape contains.
     */
    double getArea();

    Position getPosition();

    default String getDescription() {
        return getName() + "[area = " + getArea() + "]";
    }
}
