package com.example.wbdvsu19jannunziserverjava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @Test
    public void testTwoPlusTwoIs4() {
        Math math = new Math();
        int expected = 4;
        int actual = math.add(2, 2);
        assertEquals(expected, actual);
    }
}
