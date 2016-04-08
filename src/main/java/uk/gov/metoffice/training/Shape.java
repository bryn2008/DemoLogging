package uk.gov.metoffice.training;

import java.awt.*;

/**
 * Created by bryn.lloyd on 08/04/2016.
 */
public class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape color=%s", color);
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }
}
