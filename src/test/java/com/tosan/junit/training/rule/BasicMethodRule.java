package com.tosan.junit.training.rule;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class BasicMethodRule implements MethodRule {

	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		for (int i = 0; i < 5; i++) {
			try {
				base.evaluate();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return base;
	}

}