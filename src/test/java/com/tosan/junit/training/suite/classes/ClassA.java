package com.tosan.junit.training.suite.classes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tosan.junit.training.suite.categories.PerformanceTests;

public class ClassA {

    @Category(PerformanceTests.class)
    @Test
    public void test_a_1() {
        assertThat(1 == 1, equalTo(true));
    }

    @Test
    public void test_a_2() {
        assertThat(1 == 1, equalTo(true));
    }
}
