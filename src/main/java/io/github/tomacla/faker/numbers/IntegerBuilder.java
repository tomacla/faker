package io.github.tomacla.faker.numbers;

import java.util.Random;

import io.github.tomacla.faker.AbstractBuilder;

public class IntegerBuilder extends AbstractBuilder<Integer> {

    private Random rand;
    private Integer min;
    private Integer max;

    protected IntegerBuilder() {
        rand = new Random();
        min = -1000;
        max = 1000;
    }

    public Integer build() {
        return rand.nextInt(max - min) + min;
    }


    public IntegerBuilder max(int max) {
        this.max = max;
        if (this.max < this.min) {
            this.min = this.max - 1000;
        }
        return this;
    }

    public IntegerBuilder min(int min) {
        this.min = min;
        if (this.min > this.max) {
            this.max = this.min + 1000;
        }
        return this;
    }

    public IntegerBuilder between(int min, int max) {
        if (min < max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
        return this;
    }

    public static IntegerBuilder get() {
        return new IntegerBuilder();
    }

}
