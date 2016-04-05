/*
 * Copyright 2016 BolderTechnologies
 */
package circle;

import static org.junit.Assert.*;

import org.junit.Test;

import api.Position;

public class CircleTest {

    @Test
    public void testCreateCircle() {
        Position position = new Position(0, 1);
        Circle c = new Circle(1, position);

        final double expectedArea = 2 * Math.PI;
        assertEquals("Circle[area = " + expectedArea + "]", c.getDescription());

        assertEquals(0, c.getPosition().getX());
        assertEquals(1, c.getPosition().getY());
    }

}
