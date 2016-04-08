package uk.gov.metoffice.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class MainMinMaxTemp {

    public static final Logger log = LoggerFactory.getLogger(MainLog.class);

    public static void main(String[] args) {
        MinMaxTemp mm = new MinMaxTemp(-12, 55);
        int MinT = 15;
        int MaxT = 45;
        mm.setMinT(MinT);
        MinMaxTemp mm1 = new MinMaxTemp();

        log.info("{}", mm.getMinT());
        log.info("{}", mm.getMean());

    }

}
