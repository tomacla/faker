package com.thomasclarisse.faker.strings;

import com.thomasclarisse.faker.AbstractBuilder;
import com.thomasclarisse.faker.utils.ValueChecker;
import org.apache.commons.lang.RandomStringUtils;

public class SimpleStringBuilder extends AbstractBuilder<String> {

    private Integer length;
    private Boolean numbers;
    private Boolean letters;

    protected SimpleStringBuilder() {
        this.length = 10;
        this.letters = true;
        this.numbers = true;
    }

    public SimpleStringBuilder withoutNumbers() {
        this.numbers = false;
        return this;
    }

    public SimpleStringBuilder withoutLetters() {
        this.letters = false;
        return this;
    }

    public SimpleStringBuilder ofLength(Integer size) {
        ValueChecker.positive(size);
        this.length = size;
        return this;
    }

    public String build() {
        return RandomStringUtils.random(length, letters, numbers);
    }


    public static SimpleStringBuilder get() {
        return new SimpleStringBuilder();
    }

}
