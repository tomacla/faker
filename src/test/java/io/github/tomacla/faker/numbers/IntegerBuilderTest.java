package io.github.tomacla.faker.numbers;

import org.junit.Assert;
import org.junit.Test;

import io.github.tomacla.faker.numbers.IntegerBuilder;

public class IntegerBuilderTest {

    @Test
    public void noParameters() {
        Integer integer = IntegerBuilder.get().build();
        Assert.assertTrue(integer >= -1000 && integer <= 1000);
    }

    @Test
    public void min() {
        Integer integer = IntegerBuilder.get().min(900).build();
        Assert.assertTrue(integer >= 900 && integer <= 1000);
    }

    @Test
    public void max() {
        Integer integer = IntegerBuilder.get().max(-900).build();
        Assert.assertTrue(integer >= -1000 && integer <= -900);
    }

    @Test
    public void between() {
        Integer integer = IntegerBuilder.get().between(5, 10).build();
        Assert.assertTrue(integer >= 5 && integer <= 10);
    }


}
