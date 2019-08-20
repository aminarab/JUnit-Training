package com.tosan.junit.training.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tosan.junit.training.suite.categories.PerformanceTests;
import com.tosan.junit.training.suite.classes.ClassA;
import com.tosan.junit.training.suite.classes.ClassB;
import com.tosan.junit.training.suite.classes.ClassC;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
// Include multiple categories
// @Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({ ClassA.class, ClassB.class, ClassC.class })
public class PerformanceTestSuite {
}