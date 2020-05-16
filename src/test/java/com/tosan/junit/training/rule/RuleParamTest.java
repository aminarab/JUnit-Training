package com.tosan.junit.training.rule;


import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RuleParamTest extends TestCase {
	
	private Integer b=0;
	
	@Rule
//	public BasicMethodRule basicMethodRule = new BasicMethodRule();
	public ErrorHandlingMethodRule errorHandlingMethodRule = new ErrorHandlingMethodRule();
	
	@Test
	public  void myScenario(){
		b += 1;
		int a = 2+b;
		
		assertEquals(a, 2+2);
	}
	

}
