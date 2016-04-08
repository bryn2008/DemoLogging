package uk.gov.metoffice.training;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class TestTriangles {
    @Test
    public void test_can_create_a_triangle() throws Exception{
        Triangle t = new Triangle(new double[3]);
        assertTrue(t != null);
    }

    @Test
    public void test_triangle_with_three_sides() throws Exception{
        Triangle t = new Triangle(new double[] {2,3,4});
        List<Double> collection = t.getSides();
        assertThat(collection, containsInAnyOrder(4.,2.,3.));
    }


}
