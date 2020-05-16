package com.tosan.junit.training.rule;

import org.junit.rules.ErrorCollector;

public class AccessibleErrorCollector extends ErrorCollector {

    @Override
    public void verify() throws Throwable {
        super.verify();
    }
}
