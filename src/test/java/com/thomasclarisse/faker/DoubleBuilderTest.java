package com.thomasclarisse.faker;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DoubleBuilderTest {

  @Test
  public void generate() {
    
    Double d1 = DoubleBuilder.between(15.0, 25.0).build();
    Assert.assertTrue(d1.doubleValue() >= 15.0 && d1.doubleValue() <= 25.0);
    
    Double d2 = DoubleBuilder.between(15, 25).build();
    Assert.assertTrue(d2.doubleValue() >= 15.0 && d2.doubleValue() <= 25.0);
    
    List<Double> le = DoubleBuilder.between(15, 25).build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
}
