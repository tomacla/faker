package io.github.tomacla.faker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.tomacla.faker.AbstractBuilder;

public class AbstractBuilderTest {

    private SimpleStringBuilderForTest builder;

    @Before
    public void before() {
        this.builder = new SimpleStringBuilderForTest();
    }

    @Test
    public void build() {
        Assert.assertEquals("a", this.builder.build());
    }

    @Test
    public void buildAsList() {
        Assert.assertEquals(3, this.builder.build(3).size());
    }

    @Test(expected = RuntimeException.class)
    public void buildAsListNullSize() {
        this.builder.build(null);
    }

    @Test(expected = RuntimeException.class)
    public void buildAsListNegativeSize() {
        this.builder.build(-1);
    }

    public static class SimpleStringBuilderForTest extends AbstractBuilder<String> {

        @Override
        public String build() {
            return "a";
        }

    }

}
