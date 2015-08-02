package com.thomasclarisse.faker.utils;


public class ValueChecker {

    public static void notBlank(String fieldValue) {
        notBlank(fieldValue, "Value");
    }

    public static void notBlank(String fieldValue, String fieldName) {
        if (fieldValue == null || fieldValue.isEmpty()) {
            throw new RuntimeException(fieldName + " must be valued");
        }
    }

    public static void positive(Integer fieldValue) {
        positive(fieldValue, "Value");
    }

    public static void positive(Integer fieldValue, String fieldName) {
        if (fieldValue == null || fieldValue < 0) {
            throw new RuntimeException(fieldName + " must be a positive integer");
        }
    }

}
