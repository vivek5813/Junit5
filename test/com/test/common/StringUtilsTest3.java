package com.test.common;

import com.vivek.common.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class StringUtilsTest3 {

    @Test
    void testIsEmpty(){
        String s = StringUtils.reverse("");
        Assertions.assertEquals("",s);
    }

    @Test
    void testString(){
        String s = StringUtils.reverse("ABCD");
        Assertions.assertEquals("DCBA",s);
    }

    @Test
    void testStringMessage(){
        String s = StringUtils.reverse("ABCD");
        Supplier<String> stringSupplier = () -> "assertEquals failed";
        Assertions.assertEquals("DBCA",s, stringSupplier);
    }

    @Test
    void testStringNotEqualsMessage(){
        String s = StringUtils.reverse("ABCD");
        Supplier<String> stringSupplier = () -> "assertEquals failed";
        Assertions.assertNotEquals("DBCA",s, stringSupplier);
    }
}
