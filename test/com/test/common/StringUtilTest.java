package com.test.common;

import com.vivek.common.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class StringUtilTest {

    @Test
    void givenNullString_whenReversedIscalled_thenNullIsReturned(){
        String s = StringUtils.reverse(null);
        Assertions.assertNull(s);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse((""));
        String message = "Actual String should be null !!! ";

        // assertNull with message
        Assertions.assertNull(actual, message);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));
        Supplier<String> messageSupplier = () -> "Actual String should be null !!! ";

        // assertNull with Java 8 MessageSupplier
        Assertions.assertNull(actual, messageSupplier);
    }
}
