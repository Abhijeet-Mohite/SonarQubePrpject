package com.example.sonarpractice;

public class StringUtils {

    public String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }

    public boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }
}