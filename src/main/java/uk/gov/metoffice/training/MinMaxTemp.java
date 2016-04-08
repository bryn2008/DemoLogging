package uk.gov.metoffice.training;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class MinMaxTemp {

    public double MinT = Double.MIN_VALUE;
    public double MaxT = Double.MAX_VALUE;

    public MinMaxTemp() {}

    public MinMaxTemp(double minT, double maxT) {
        MinT = minT;
        MaxT = maxT;
    }



    public double getMinT() {
        return MinT;
    }

    public void setMinT(double minT) {
        MinT = minT;
    }

    public double getMaxT() {
        return MaxT;
    }

    public void setMaxT(double maxT) {
        MaxT = maxT;
    }

    public double getMean() {
        return (MaxT + MinT) / 2;
    }
}
