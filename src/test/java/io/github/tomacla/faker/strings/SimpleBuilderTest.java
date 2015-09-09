package io.github.tomacla.faker.strings;

import org.junit.Assert;
import org.junit.Test;

import io.github.tomacla.faker.strings.SimpleStringBuilder;

public class SimpleBuilderTest {

    @Test
    public void noParameters() {
        Assert.assertEquals(10, SimpleStringBuilder.get().build().length());
    }

    @Test
    public void length() {
        Assert.assertEquals(15, SimpleStringBuilder.get().ofLength(15).build().length());
    }

    @Test
    public void withoutNumbers() {
        Assert.assertTrue(SimpleStringBuilder.get().withoutNumbers().build().matches("^[a-zA-Z]+$"));
    }

    @Test
    public void withoutLetters() {
        Assert.assertTrue(SimpleStringBuilder.get().withoutLetters().build().matches("^[0-9]+$"));
    }

}
