package com.thomasclarisse.faker.strings;


import org.junit.Assert;
import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void url() {
        Assert.assertNotNull(StringBuilder.url());
    }

    @Test
    public void simple() {
        Assert.assertNotNull(StringBuilder.simple());
    }

    @Test
    public void phoneNumber() {
        Assert.assertNotNull(StringBuilder.phoneNumber());
    }

    @Test
    public void email() {
        Assert.assertNotNull(StringBuilder.email());
    }

    @Test
    public void text() {
        Assert.assertNotNull(StringBuilder.text());
    }


}
