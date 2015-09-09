package io.github.tomacla.faker;


import io.github.tomacla.faker.numbers.DoubleBuilder;
import io.github.tomacla.faker.numbers.IntegerBuilder;
import io.github.tomacla.faker.strings.*;

public class Faker {

    private Faker() {

    }

    public static DoubleBuilder doubles() {
        return DoubleBuilder.get();
    }

    public static IntegerBuilder integers() {
        return IntegerBuilder.get();
    }

    public static UrlBuilder url() {
        return UrlBuilder.get();
    }

    public static SimpleStringBuilder simpleString() {
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

}
