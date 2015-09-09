package io.github.tomacla.faker.strings;

import io.github.tomacla.faker.AbstractBuilder;
import io.github.tomacla.faker.utils.ValueChecker;

public class PhoneNumberBuilder extends AbstractBuilder<String> {

    private boolean international;
    private String country;
    private String number;

    protected PhoneNumberBuilder() {
        this.country = "33";
        this.international = false;
        this.number = "123456789";
    }

    public PhoneNumberBuilder withNumber(String number) {
        ValueChecker.notBlank(number, "Number");
        this.number = number;
        return this;
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
        ValueChecker.notBlank(countryIndicator, "Country indicator");
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

    public static PhoneNumberBuilder get() {
        return new PhoneNumberBuilder();
    }

}
