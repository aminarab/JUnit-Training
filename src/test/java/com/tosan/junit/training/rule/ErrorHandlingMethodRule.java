package com.tosan.junit.training.rule;

import junit.framework.TestCase;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class ErrorHandlingMethodRule implements MethodRule {

	AccessibleErrorCollector errorCollector = new AccessibleErrorCollector();

	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		for (int i = 0; i < 5; i++) {
			try {
				base.evaluate();
			} catch (Throwable e) {
				e.printStackTrace();// machine
				errorCollector.addError(new AssertionError(
						"For repeate execute : " + i, e));
				
			}
		}
		try {
			errorCollector.verify();
		} catch (Throwable e) {
//			TestCase testCase = (TestCase) target;
//			testCase.fail(e.getMessage());
			TestCase.fail("asjkldhjkashdjkashdjkashd : " + e.getMessage());// human
			
		}
		return base;
	}

}
