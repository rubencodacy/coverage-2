package com.codacy.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Math3Test {
    @Test
    public void shouldAddNumbers() {
        Math3 math = new Math3(23);

        assertEquals(7, math.magicAdd(3, 4));
    }

    // Uncomment this to have 100% coverage
    // @Test
    // public void shouldSubtractIfMagicNumber() {
    //     Math3 math = new Math3(4);
    //     assertEquals(1, math.magicAdd(3, 4));
    // }
}
