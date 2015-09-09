package io.github.tomacla.faker.numbers;

import org.junit.Assert;
import org.junit.Test;

import io.github.tomacla.faker.numbers.DoubleBuilder;

public class DoubleBuilderTest {

    @Test
    public void noParameters() {
        Double doubl = DoubleBuilder.get().build();
        Assert.assertTrue(doubl >= -1000 && doubl <= 1000);
    }

    @Test
    public void between() {
        Double doubl = DoubleBuilder.get().between(5, 10).build();
        Assert.assertTrue(doubl >= 5 && doubl <= 10);
    }

    @Test
    public void betweenDouble() {
        Double doubl = DoubleBuilder.get().between(5.0, 7.0).build();
        Assert.assertTrue(doubl >= 5 && doubl <= 10);
    }

}
