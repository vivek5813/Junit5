package com.test.assumtion;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumeFalseDemo {
    @Test
    void testOnDevelopmentEnvironment() {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), "Assumption failed");
        //remainder of test will be aborted
    }

    @Test
    void testOnProductionEnvironment() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
        // remainder of test will proceed
    }
}
