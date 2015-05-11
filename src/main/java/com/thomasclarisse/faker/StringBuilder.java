package com.thomasclarisse.faker;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.bson.types.ObjectId;

import de.svenjacobs.loremipsum.LoremIpsum;


public class StringBuilder {

  private StringBuilder() {

  }

  public static UrlBuilder url() {
    return new UrlBuilder();
  }

  public static SimpleStringBuilder simple() {
    return new SimpleStringBuilder();
  }

  public static PhoneNumberBuilder phoneNumber() {
    return new PhoneNumberBuilder();
  }

  public static EmailBuilder email() {
    return new EmailBuilder();
  }

  public static TextBuilder text() {
    return new TextBuilder();
  }

  public static ObjectIdBuilder objectId() {
    return new ObjectIdBuilder();
  }

  public static class SimpleStringBuilder {

    private Integer length;
    private Boolean numbers;
    private Boolean letters;

    protected SimpleStringBuilder() {
      this.length = 10;
      this.letters = true;
      this.numbers = true;
    }

    public SimpleStringBuilder withoutNumbers() {
      this.numbers = false;
      return this;
    }

    public SimpleStringBuilder withNumbers() {
      this.numbers = true;
      return this;
    }

    public SimpleStringBuilder withoutLetters() {
      this.letters = false;
      return this;
    }

    public SimpleStringBuilder withLetters() {
      this.letters = true;
      return this;
    }

    public SimpleStringBuilder ofLength(Integer size) {
      this.length = size;
      return this;
    }

    public String build() {
      return RandomStringUtils.random(length, letters, numbers);
    }

    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }

  public static class PhoneNumberBuilder {

    private boolean international;
    private String country;
    private String number;

    protected PhoneNumberBuilder() {
      this.country = "33";
      this.international = false;
      this.number = "123456789";
    }

    public PhoneNumberBuilder france() {
      this.country = "33";
      return this;
    }

    public PhoneNumberBuilder usa() {
      this.country = "1";
      return this;
    }

    public PhoneNumberBuilder countryIndicator(String countryIndicator) {
      this.country = countryIndicator;
      return this;
    }

    public PhoneNumberBuilder asInternational() {
      this.international = true;
      return this;
    }

    public PhoneNumberBuilder asNational() {
      this.international = false;
      return this;
    }

    public String build() {
      if (international) {
        return "+" + country + number;
      }
      return "0" + number;
    }
    
    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }

  public static class TextBuilder {

    private LoremIpsum generator;
    private String text;

    protected TextBuilder() {
      this.generator = new LoremIpsum();
      this.text = generator.getWords(10);
    }

    public TextBuilder withWords(Integer size) {
      this.text = generator.getWords(size);
      return this;
    }

    public TextBuilder withParagraphs(Integer size) {
      this.text = generator.getParagraphs(size);
      return this;
    }

    public String build() {
      return text;
    }
    
    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }
  
  public static class ObjectIdBuilder {

    protected ObjectIdBuilder() {
    }

    public String build() {
      return ObjectId.get().toString();
    }
    
    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }

  public static class EmailBuilder {

    private String name;
    private String domain;
    private String ext;

    protected EmailBuilder() {
      ext = "com";
      domain = "sample";
      name = "john.doe";
    }

    public String build() {
      return name + "@" + domain + "." + ext;
    }

    public EmailBuilder withName(String name) {
      this.name = name;
      return this;
    }

    public EmailBuilder withName(String firstName, String lastName) {
      this.name = firstName + "." + lastName;
      return this;
    }

    public EmailBuilder withDomain(String domain) {
      this.domain = domain;
      return this;
    }

    public EmailBuilder withDomain(String domain, String ext) {
      this.domain = domain;
      this.ext = ext;
      return this;
    }

    public EmailBuilder dotCom() {
      this.ext = "com";
      return this;
    }

    public EmailBuilder dotOrg() {
      this.ext = "org";
      return this;
    }

    public EmailBuilder dotNet() {
      this.ext = "net";
      return this;
    }

    public EmailBuilder dot(String ext) {
      this.ext = ext;
      return this;
    }
    
    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }

  public static class UrlBuilder {

    private String protocol;
    private String domain;
    private String subdomain;
    private String path;
    private String ext;

    protected UrlBuilder() {
      protocol = "http";
      ext = "com";
      domain = "sample";
      subdomain = "www";
      path = "";
    }

    public String build() {
      return protocol + "://" + subdomain + "." + domain + "." + ext + "/" + path;
    }

    public UrlBuilder http() {
      this.protocol = "http";
      return this;
    }

    public UrlBuilder ftp() {
      this.protocol = "ftp";
      return this;
    }

    public UrlBuilder withProtocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    public UrlBuilder withPath(String path) {
      this.path = path;
      return this;
    }

    public UrlBuilder withDomain(String domain) {
      this.domain = domain;
      return this;
    }

    public UrlBuilder withDomain(String domain, String ext) {
      this.domain = domain;
      this.ext = ext;
      return this;
    }

    public UrlBuilder withDomain(String domain, String subdomain, String ext) {
      this.domain = domain;
      this.subdomain = subdomain;
      this.ext = ext;
      return this;
    }

    public UrlBuilder dotCom() {
      this.ext = "com";
      return this;
    }

    public UrlBuilder dotOrg() {
      this.ext = "org";
      return this;
    }

    public UrlBuilder dotNet() {
      this.ext = "net";
      return this;
    }

    public UrlBuilder dot(String ext) {
      this.ext = ext;
      return this;
    }
    
    public List<String> build(Integer size) {
      List<String> list = new ArrayList<String>();
      for (int i = 0; i < size.intValue(); i++) {
        list.add(this.build());
      }
      return list;
    }

  }

}
