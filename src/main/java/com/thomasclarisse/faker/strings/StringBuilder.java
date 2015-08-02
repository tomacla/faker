package com.thomasclarisse.faker.strings;


public class StringBuilder {

    private StringBuilder() {

    }

    public static UrlBuilder url() {
        return UrlBuilder.get();
    }

    public static SimpleStringBuilder simple() {
        return SimpleStringBuilder.get();
    }

    public static PhoneNumberBuilder phoneNumber() {
        return PhoneNumberBuilder.get();
    }

    public static EmailBuilder email() {
        return EmailBuilder.get();
    }

    public static TextBuilder text() {
        return TextBuilder.get();
    }

    public static StringBuilder get() {
        return new StringBuilder();
    }

}
