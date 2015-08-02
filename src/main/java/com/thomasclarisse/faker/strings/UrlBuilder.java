package com.thomasclarisse.faker.strings;

import com.thomasclarisse.faker.AbstractBuilder;
import com.thomasclarisse.faker.utils.ValueChecker;


public class UrlBuilder extends AbstractBuilder<String> {

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
        String begin = protocol + "://" + subdomain + "." + domain + "." + ext;
        if (path != null && path.length() > 0) {
            return begin + "/" + path;
        }
        return begin;
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
        ValueChecker.notBlank(protocol, "Protocol");
        this.protocol = protocol;
        return this;
    }

    public UrlBuilder withPath(String path) {
        ValueChecker.notBlank(path, "Path");
        this.path = path;
        if (this.path.startsWith("/")) {
            this.path = this.path.substring(1);
        }
        return this;
    }

    public UrlBuilder withDomain(String domain) {
        ValueChecker.notBlank(domain, "Domain");
        this.domain = domain;
        return this;
    }

    public UrlBuilder withDomain(String domain, String ext) {
        ValueChecker.notBlank(domain, "Domain");
        ValueChecker.notBlank(ext, "Ext");
        this.domain = domain;
        this.ext = ext;
        return this;
    }

    public UrlBuilder withDomain(String domain, String subdomain, String ext) {
        ValueChecker.notBlank(domain, "Domain");
        ValueChecker.notBlank(subdomain, "Subdomain");
        ValueChecker.notBlank(ext, "Ext");
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
        ValueChecker.notBlank(ext, "Ext");
        this.ext = ext;
        return this;
    }

    public static UrlBuilder get() {
        return new UrlBuilder();
    }

}
