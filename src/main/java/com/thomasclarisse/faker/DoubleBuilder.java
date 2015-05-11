package com.thomasclarisse.faker;

import java.util.ArrayList;
import java.util.List;

public class DoubleBuilder {

  private Double min;
  private Double max;

  private DoubleBuilder() {
    min = -1000.0;
    max = 1000.0;
  }

  public Double build() {
    return Math.random() * (max - min) + min;
  }

  public List<Double> build(Integer size) {
    List<Double> list = new ArrayList<Double>();
    for (int i = 0; i < size.intValue(); i++) {
      list.add(this.build());
    }
    return list;
  }
  
  
  public static DoubleBuilder between(int min, int max) {
    DoubleBuilder builder = new DoubleBuilder();
    builder.min = new Double(min);
    builder.max = new Double(max);
    return builder;
  }

  public static DoubleBuilder between(double min, double max) {
    DoubleBuilder builder = new DoubleBuilder();
    builder.min = min;
    builder.max = max;
    return builder;
  }

}
