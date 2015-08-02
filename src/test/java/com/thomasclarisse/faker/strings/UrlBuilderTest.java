package com.thomasclarisse.faker.strings;


import org.junit.Assert;
import org.junit.Test;

public class UrlBuilderTest {

    @Test
    public void noParameters() {
        Assert.assertEquals("http://www.sample.com", UrlBuilder.get().build());
    }

    @Test
    public void dot() {
        Assert.assertEquals("http://www.sample.fr", UrlBuilder.get().dot("fr").build());
    }

    @Test
    public void dotCom() {
        Assert.assertEquals("http://www.sample.com", UrlBuilder.get().dotCom().build());
    }

    @Test
    public void dotNet() {
        Assert.assertEquals("http://www.sample.net", UrlBuilder.get().dotNet().build());
    }

    @Test
    public void dotOrg() {
        Assert.assertEquals("http://www.sample.org", UrlBuilder.get().dotOrg().build());
    }

    @Test
    public void ftp() {
        Assert.assertEquals("ftp://www.sample.com", UrlBuilder.get().ftp().build());
    }

    @Test
    public void http() {
        Assert.assertEquals("http://www.sample.com", UrlBuilder.get().http().build());
    }

    @Test
    public void withProtocol() {
        Assert.assertEquals("smtp://www.sample.com", UrlBuilder.get().withProtocol("smtp").build());
    }

    @Test
    public void withDomain() {
        Assert.assertEquals("http://www.google.com", UrlBuilder.get().withDomain("google").build());
    }

    @Test
    public void withDomainAndExt() {
        Assert.assertEquals("http://www.google.de", UrlBuilder.get().withDomain("google", "de").build());
    }

    @Test
    public void withDomainAndSubdomainAndExt() {
        Assert.assertEquals("http://search.google.de", UrlBuilder.get().withDomain("google", "search", "de").build());
    }

    @Test
    public void withPath() {
        Assert.assertEquals("http://www.sample.com/test/search", UrlBuilder.get().withPath("test/search").build());
    }

    @Test
    public void withSlashPath() {
        Assert.assertEquals("http://www.sample.com/test/search", UrlBuilder.get().withPath("/test/search").build());
    }


}
