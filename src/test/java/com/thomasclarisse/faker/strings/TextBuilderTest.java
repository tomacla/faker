package com.thomasclarisse.faker.strings;


import org.junit.Assert;
import org.junit.Test;

public class TextBuilderTest {

    @Test
    public void noParamaters() {
        Assert.assertNotNull(TextBuilder.get().build());
    }

    @Test
    public void paragraphs() {
        Assert.assertNotNull(TextBuilder.get().withParagraphs(5).build());
    }

    @Test
    public void words() {
        Assert.assertNotNull(TextBuilder.get().withWords(5).build());
    }

}
