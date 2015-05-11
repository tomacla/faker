package com.thomasclarisse.faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerBuilder {

  private Random rand;
  private Integer min;
  private Integer max;

  private IntegerBuilder() {
    rand = new Random();
    min = -1000;
    max = 1000;
  }

  public Integer build() {
    return rand.nextInt(max - min) + min;
  }
  
  public List<Integer> build(Integer size) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < size.intValue(); i++) {
      list.add(this.build());
    }
    return list;
  }

  public static IntegerBuilder max(int max) {
    IntegerBuilder builder = new IntegerBuilder();
    builder.max = max;
    if(builder.max < builder.min) {
      builder.min = builder.max - 1000;
    }
    return builder;
  }

  public static IntegerBuilder min(int min) {
    IntegerBuilder builder = new IntegerBuilder();
    builder.min = min;
    if(builder.min > builder.max) {
      builder.max = builder.min + 1000;
    }
    return builder;
  }
  
  public static IntegerBuilder between(int min, int max) {
    IntegerBuilder builder = new IntegerBuilder();
    builder.min = min;
    builder.max = max;
    return builder;
  }

}
