package io.github.tomacla.faker.strings;

import de.svenjacobs.loremipsum.LoremIpsum;
import io.github.tomacla.faker.AbstractBuilder;
import io.github.tomacla.faker.utils.ValueChecker;


public class TextBuilder extends AbstractBuilder<String> {

    private LoremIpsum generator;
    private String text;

    protected TextBuilder() {
        this.generator = new LoremIpsum();
        this.text = generator.getWords(10);
    }

    public TextBuilder withWords(Integer size) {
        ValueChecker.positive(size, "Size");
        this.text = generator.getWords(size);
        return this;
    }

    public TextBuilder withParagraphs(Integer size) {
        ValueChecker.positive(size, "Size");
        this.text = generator.getParagraphs(size);
        return this;
    }

    public String build() {
        return text;
    }

    public static TextBuilder get() {
        return new TextBuilder();
    }

}
