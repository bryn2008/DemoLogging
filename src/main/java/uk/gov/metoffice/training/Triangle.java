package uk.gov.metoffice.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class Triangle {

    double[] sides;

    public Triangle(double[] sides) {
        this.sides = sides;
    }

//    public Triangle(double s1, double s2, double s3) {
//        this(new Double[] {s1, s2, s3});
//    }

    public List<Double> getSides() {
        return Arrays.asList(sides[0], sides[1], sides[2]);
    }
}
