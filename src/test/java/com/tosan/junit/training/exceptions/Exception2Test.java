package com.tosan.junit.training.exceptions;

import java.util.ArrayList;

import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
//fail() usecaes
//mark a test that is incomplete, so it fails and warns you until you can finish it
//making sure an exception is thrown:	
public class Exception2Test {
	@Test
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
			//assert others
        }
    }

    @Test
    public void testEmptyList() {
        try {
            new ArrayList<Integer>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
