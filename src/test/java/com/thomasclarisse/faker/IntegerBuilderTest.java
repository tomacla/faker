package com.thomasclarisse.faker;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegerBuilderTest {

  @Test
  public void generate() {
    
    Integer i1 = IntegerBuilder.max(500).build();
    Assert.assertTrue(i1.intValue() < 500);
    
    Integer i2 = IntegerBuilder.min(52).build();
    Assert.assertTrue(i2.intValue() > 52);
    
    Integer i3 = IntegerBuilder.between(15, 25).build();
    Assert.assertTrue(i3.intValue() >= 15 && i3.intValue() <= 25);
    
    List<Integer> le = IntegerBuilder.min(52).build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
}
