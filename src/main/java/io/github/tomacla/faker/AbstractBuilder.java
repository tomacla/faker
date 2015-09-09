package io.github.tomacla.faker;


import java.util.ArrayList;
import java.util.List;

import io.github.tomacla.faker.utils.ValueChecker;

public abstract class AbstractBuilder<T> {

    public abstract T build();

    public List<T> build(Integer size) {
        ValueChecker.positive(size, "Size");
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size.intValue(); i++) {
            list.add(this.build());
        }
        return list;
    }

}