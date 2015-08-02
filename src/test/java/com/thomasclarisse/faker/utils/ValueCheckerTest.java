package com.thomasclarisse.faker.utils;

import org.junit.Test;

public class ValueCheckerTest {

    @Test
    public void notBlank() {
        ValueChecker.notBlank("foo");
    }

    @Test
    public void notBlankWithName() {
        ValueChecker.notBlank("foo", "bar");
    }

    @Test(expected = RuntimeException.class)
    public void notBlankNullValue() {
        ValueChecker.notBlank(null);
    }

    @Test(expected = RuntimeException.class)
    public void notBlankNullValueWithName() {
        ValueChecker.notBlank(null, "bar");
    }

    @Test(expected = RuntimeException.class)
    public void notBlankEmptyValueWithName() {
        ValueChecker.notBlank("", "bar");
    }

    @Test(expected = RuntimeException.class)
    public void notBlankEmptyValue() {
        ValueChecker.notBlank("");
    }

    @Test
    public void positive() {
        ValueChecker.positive(15);
    }

    @Test
    public void positiveWithName() {
        ValueChecker.positive(15, "bar");
    }

    @Test(expected = RuntimeException.class)
    public void positiveNullValue() {
        ValueChecker.positive(null);
    }

    @Test(expected = RuntimeException.class)
    public void positiveNullValueWithName() {
        ValueChecker.positive(null, "bar");
    }

    @Test(expected = RuntimeException.class)
    public void positiveEmptyValueWithName() {
        ValueChecker.positive(-15, "bar");
    }

    @Test(expected = RuntimeException.class)
    public void positiveEmptyValue() {
        ValueChecker.positive(-15);
    }

}
