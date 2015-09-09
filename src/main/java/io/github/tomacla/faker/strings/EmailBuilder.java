package io.github.tomacla.faker.strings;

import io.github.tomacla.faker.AbstractBuilder;
import io.github.tomacla.faker.utils.ValueChecker;

public class EmailBuilder extends AbstractBuilder<String> {

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
        ValueChecker.notBlank(name, "Name");
        this.name = name;
        return this;
    }

    public EmailBuilder withName(String firstName, String lastName) {
        ValueChecker.notBlank(firstName, "Firstname");
        ValueChecker.notBlank(lastName, "Lastname");
        this.name = firstName + "." + lastName;
        return this;
    }

    public EmailBuilder withDomain(String domain) {
        ValueChecker.notBlank(domain, "Domain");
        this.domain = domain;
        return this;
    }

    public EmailBuilder withDomain(String domain, String ext) {
        ValueChecker.notBlank(domain, "Domain");
        ValueChecker.notBlank(ext, "Ext");
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
        ValueChecker.notBlank(ext, "Ext");
        this.ext = ext;
        return this;
    }

    public static EmailBuilder get() {
        return new EmailBuilder();
    }

}
