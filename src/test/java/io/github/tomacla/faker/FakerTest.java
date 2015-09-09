package io.github.tomacla.faker;


import org.junit.Assert;
import org.junit.Test;

import io.github.tomacla.faker.Faker;

public class FakerTest {


    @Test
    public void doubles() {
        Assert.assertNotNull(Faker.doubles());
    }

    @Test
    public void integers() {
        Assert.assertNotNull(Faker.integers());
    }

    @Test
    public void url() {
        Assert.assertNotNull(Faker.url());
    }

    @Test
    public void simpleString() {
        Assert.assertNotNull(Faker.simpleString());
    }

    @Test
    public void phoneNumber() {
        Assert.assertNotNull(Faker.phoneNumber());
    }

    @Test
    public void email() {
        Assert.assertNotNull(Faker.email());
    }

    @Test
    public void text() {
        Assert.assertNotNull(Faker.text());
    }

}
