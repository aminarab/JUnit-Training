package com.tosan.junit.training.exceptions;

import java.util.ArrayList;

import org.junit.Test;

public class Exception1Test {

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<Integer>().get(0);
    }

}
