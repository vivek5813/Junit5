package com.test.common;

import com.vivek.common.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class StringUtilsTest2 {
    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse((null));
        String message = "Actual String should not be null !!! ";

        // assertNotNull with message
        Assertions.assertNotNull(actual, message);
    }

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned2() {
        String actual = StringUtils.reverse((null));
        Supplier<String> messageSupplier = () -> "Actual String should not be null !!! ";

        // assertNotNull with Java 8 MessageSupplier
        Assertions.assertNotNull(actual, messageSupplier);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse((""));

        // assertNotNull without message
        Assertions.assertNotNull(actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));

        // assertNotNull without message
        Assertions.assertNotNull(actual);
    }
}
