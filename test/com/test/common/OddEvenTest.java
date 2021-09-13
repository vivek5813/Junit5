package com.test.common;

import com.vivek.common.OddEven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    void givenEvenNumber_whenIsEvenIsCalled_thenTrueIsReturned() {
        OddEven oddEven = new OddEven();
        Assertions.assertTrue(oddEven.isNumberEven(10));
    }

    @Test
    void givenOddNumber_whenIsEvenIsCalled_thenFalseIsReturned() {
        OddEven oddEven = new OddEven();
        Assertions.assertFalse(oddEven.isNumberEven(11));
    }
}
