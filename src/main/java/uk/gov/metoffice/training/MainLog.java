package uk.gov.metoffice.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bryn.lloyd on 07/04/2016.
 */
public class MainLog {
    public static final Logger log = LoggerFactory.getLogger(MainLog.class);

    public static void main(String[] args) {
        int n =1;
        log.info("It works!");
        log.debug("Value of n was {} probably worked", n);
    }
}