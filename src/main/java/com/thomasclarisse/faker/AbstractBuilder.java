package com.thomasclarisse.faker;


import com.thomasclarisse.faker.utils.ValueChecker;

import java.util.ArrayList;
import java.util.List;

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