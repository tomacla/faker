package io.github.tomacla.faker.strings;

import org.junit.Assert;
import org.junit.Test;

import io.github.tomacla.faker.strings.PhoneNumberBuilder;

public class PhoneNumberBuilderTest {

    @Test
    public void noParameters() {
        Assert.assertEquals("0123456789", PhoneNumberBuilder.get().build());
    }

    @Test
    public void number() {
        Assert.assertEquals("056325632", PhoneNumberBuilder.get().withNumber("56325632").build());
    }

    @Test
    public void international() {
        Assert.assertEquals("+33123456789", PhoneNumberBuilder.get().asInternational().build());
    }

    @Test
    public void franceInternational() {
        Assert.assertEquals("+33123456789", PhoneNumberBuilder.get().france().asInternational().build());
    }

    @Test
    public void franceNational() {
        Assert.assertEquals("0123456789", PhoneNumberBuilder.get().france().asNational().build());
    }

    @Test
    public void usaInternational() {
        Assert.assertEquals("+1123456789", PhoneNumberBuilder.get().usa().asInternational().build());
    }


    @Test
    public void usaNational() {
        Assert.assertEquals("0123456789", PhoneNumberBuilder.get().usa().asNational().build());
    }

    @Test
    public void countryNational() {
        Assert.assertEquals("0123456789", PhoneNumberBuilder.get().countryIndicator("50").asNational().build());
    }

    @Test
    public void countryInternational() {
        Assert.assertEquals("+50123456789", PhoneNumberBuilder.get().countryIndicator("50").asInternational().build());
    }

}
