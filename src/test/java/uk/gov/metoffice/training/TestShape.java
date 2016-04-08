package uk.gov.metoffice.training;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestShape {
    static final double EPS = 1e-2;

    @Test
    public void testGenericBlueShape() {
        Shape shape = new Shape(Color.BLUE);
        assertThat(shape.getColor(), is(Color.BLUE));
        assertThat(shape.getArea(), is(Matchers.closeTo(0, EPS)));
    }
}