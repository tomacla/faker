package com.thomasclarisse.faker;


import org.junit.Assert;
import org.junit.Test;

public class FakerTest {

    @Test
    public void strings() {
        Assert.assertNotNull(Faker.strings());
    }

    @Test
    public void doubles() {
        Assert.assertNotNull(Faker.doubles());
    }

    @Test
    public void integers() {
        Assert.assertNotNull(Faker.integers());
    }

}
