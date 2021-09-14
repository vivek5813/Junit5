package com.test.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTrueDemo {
    @Test
    public void testAssertTrueWithTrueCondition() {
        boolean trueValue = true;
        assertTrue(trueValue);
    }

    @Test
    public void testAssertTrueWithFalseCondition() {
        boolean falseValue = false;
        assertTrue(falseValue);
    }

    @Test
    public void testAssertTrueWithFalseConditionAndMessage() {
        boolean falseValue = false;
        assertTrue(falseValue, "The actual value is false");
    }

    @Test
    public void testAssertTrueWithFalseConditionAndMessageSupplier() {
        boolean falseValue = false;
        assertTrue(falseValue, () -> "The actual value is false");
    }

    @Test
    public void testAssertTrueWithBooleanSupplier() {
        boolean trueValue = true;
        assertTrue(() -> trueValue);
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessage() {
        boolean falseValue = false;
        assertTrue(() -> falseValue, "The actual value is false");
    }

    @Test
    public void testAssertTrueWithBooleanSupplierAndMessageSupplier() {
        boolean falseValue = false;
        assertTrue(() -> falseValue, () -> "The actual value is false");
    }
}
