package com.tosan.junit.training.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tosan.junit.training.exceptions.Exception1Test;
import com.tosan.junit.training.timeout.TimeoutTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Exception1Test.class, //test case 1
        TimeoutTest.class     //test case 2
})
public class SuiteAbcTest {
	//normally, this is an empty class
}