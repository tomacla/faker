package com.thomasclarisse.faker.strings;

import org.junit.Assert;
import org.junit.Test;

public class EmailBuilderTest {

    @Test
    public void noParameters() {
        Assert.assertEquals("john.doe@sample.com", EmailBuilder.get().build());
    }

    @Test
    public void name() {
        Assert.assertEquals("toma@sample.com", EmailBuilder.get().withName("toma").build());
    }

    @Test(expected = RuntimeException.class)
    public void nameEmpty() {
        EmailBuilder.get().withName("").build();
    }

    @Test(expected = RuntimeException.class)
    public void nameNull() {
        EmailBuilder.get().withName("").build();
    }

    @Test
    public void nameAndFamilyName() {
        Assert.assertEquals("toma.cla@sample.com", EmailBuilder.get().withName("toma", "cla").build());
    }

    @Test(expected = RuntimeException.class)
    public void nameEmptyAndFamilyName() {
        EmailBuilder.get().withName("", "cla").build();
    }

    @Test(expected = RuntimeException.class)
    public void nameNullAndFamilyName() {
        EmailBuilder.get().withName(null, "cla").build();
    }

    @Test(expected = RuntimeException.class)
    public void nameAndFamilyNameEmpty() {
        EmailBuilder.get().withName("toma", "").build();
    }

    @Test(expected = RuntimeException.class)
    public void nameAndFamilyNameNull() {
        EmailBuilder.get().withName("toma", null).build();
    }

    @Test
    public void domain() {
        Assert.assertEquals("john.doe@gmail.com", EmailBuilder.get().withDomain("gmail").build());
    }


    @Test(expected = RuntimeException.class)
    public void domainEmpty() {
        EmailBuilder.get().withDomain("").build();
    }

    @Test(expected = RuntimeException.class)
    public void domainNull() {
        EmailBuilder.get().withDomain(null).build();
    }

    @Test
    public void domainAndExtension() {
        Assert.assertEquals("john.doe@gmail.fr", EmailBuilder.get().withDomain("gmail", "fr").build());
    }

    @Test(expected = RuntimeException.class)
    public void domainEmptyAndExtension() {
        EmailBuilder.get().withDomain("", "fr").build();
    }

    @Test(expected = RuntimeException.class)
    public void domainNullAndExtension() {
        EmailBuilder.get().withDomain(null, "fr").build();
    }

    @Test(expected = RuntimeException.class)
    public void domainAndExtensionEmpty() {
        EmailBuilder.get().withDomain("gmail", "").build();
    }

    @Test(expected = RuntimeException.class)
    public void domainAndExtensionNull() {
        EmailBuilder.get().withDomain("gmail", null).build();
    }

    @Test
    public void dotOrg() {
        Assert.assertEquals("john.doe@sample.org", EmailBuilder.get().dotOrg().build());
    }

    @Test
    public void dotNet() {
        Assert.assertEquals("john.doe@sample.net", EmailBuilder.get().dotNet().build());
    }

    @Test
    public void dotCom() {
        Assert.assertEquals("john.doe@sample.com", EmailBuilder.get().dotCom().build());
    }

    @Test
    public void dot() {
        Assert.assertEquals("john.doe@sample.de", EmailBuilder.get().dot("de").build());
    }

    @Test(expected = RuntimeException.class)
    public void dotEmpty() {
        EmailBuilder.get().dot("").build();
    }

    @Test(expected = RuntimeException.class)
    public void dotNull() {
        EmailBuilder.get().dot(null).build();
    }


}
