package uk.gov.metoffice.training;

import java.awt.*;

/**
 * Created by bryn.lloyd on 08/04/2016.
 */
public class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0; //getHeight()*getWidth();
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
