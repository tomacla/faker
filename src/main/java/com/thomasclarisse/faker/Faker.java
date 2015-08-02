package com.thomasclarisse.faker;


import com.thomasclarisse.faker.numbers.DoubleBuilder;
import com.thomasclarisse.faker.numbers.IntegerBuilder;
import com.thomasclarisse.faker.strings.StringBuilder;

public class Faker {

    private Faker() {

    }

    public static StringBuilder strings() {
        return StringBuilder.get();
    }

    public static DoubleBuilder doubles() {
        return DoubleBuilder.get();
    }

    public static IntegerBuilder integers() {
        return IntegerBuilder.get();
    }
}
