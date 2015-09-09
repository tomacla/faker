package io.github.tomacla.faker.numbers;

import io.github.tomacla.faker.AbstractBuilder;

public class DoubleBuilder extends AbstractBuilder<Double> {

    private Double min;
    private Double max;

    protected DoubleBuilder() {
        min = -1000.0;
        max = 1000.0;
    }

    public Double build() {
        return Math.random() * (max - min) + min;
    }


    public DoubleBuilder between(int min, int max) {
        this.min = new Double(min);
        this.max = new Double(max);
        return this;
    }

    public DoubleBuilder between(double min, double max) {
        this.min = min;
        this.max = max;
        return this;
    }

    public static DoubleBuilder get() {
        return new DoubleBuilder();
    }

}
