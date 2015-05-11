package com.thomasclarisse.faker;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StringBuilderTest {

  @Test
  public void url() {
    
    String url1 = StringBuilder.url().build();
    Assert.assertEquals(url1, "http://www.sample.com/");
    
    String url2 = StringBuilder.url().dotNet().build();
    Assert.assertEquals(url2, "http://www.sample.net/");
    
    String url3 = StringBuilder.url().dotOrg().build();
    Assert.assertEquals(url3, "http://www.sample.org/");
    
    String url4 = StringBuilder.url().withDomain("google", "search", "fr").build();
    Assert.assertEquals(url4, "http://search.google.fr/");
    
    String url5 = StringBuilder.url().withDomain("google", "ru").withPath("home/foo").build();
    Assert.assertEquals(url5, "http://www.google.ru/home/foo");
    
    List<String> le = StringBuilder.url().build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
  @Test
  public void oid() {
    
    String oid1 = StringBuilder.objectId().build();
    Assert.assertNotNull(oid1);
    
    List<String> le = StringBuilder.url().build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
  @Test
  public void phoneNumber() {
    
    String pn1 = StringBuilder.phoneNumber().build();
    Assert.assertEquals(pn1, "0123456789");
    
    String pn2 = StringBuilder.phoneNumber().france().asInternational().build();
    Assert.assertEquals(pn2, "+33123456789");
    
    String pn3 = StringBuilder.phoneNumber().usa().asInternational().build();
    Assert.assertEquals(pn3, "+1123456789");
    
    List<String> le = StringBuilder.phoneNumber().build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
  @Test
  public void simple() {
    
    String s1 = StringBuilder.simple().ofLength(5).build();
    Assert.assertEquals(s1.length(), 5);
    
    String s2 = StringBuilder.simple().ofLength(5).withoutNumbers().build();
    Assert.assertEquals(s2.length(), 5);
    Assert.assertTrue(s2.matches ("^[a-zA-Z]+$"));
    
    String s3 = StringBuilder.simple().ofLength(15).withoutLetters().build();
    Assert.assertEquals(s3.length(), 15);
    Assert.assertTrue(s3.matches ("^[0-9]+$"));
    
    List<String> le = StringBuilder.simple().build(5);
    Assert.assertEquals(le.size(), 5);
    
    
  }
  
  
  @Test
  public void email() {
    
    String e1 = StringBuilder.email().build();
    Assert.assertEquals(e1, "john.doe@sample.com");
    
    String e2 = StringBuilder.email().dotNet().build();
    Assert.assertEquals(e2, "john.doe@sample.net");
    
    String e3 = StringBuilder.email().withName("foo", "bar").withDomain("google").dotOrg().build();
    Assert.assertEquals(e3, "foo.bar@google.org");
    
    List<String> le = StringBuilder.email().build(5);
    Assert.assertEquals(le.size(), 5);
    
  }
  
  
}
