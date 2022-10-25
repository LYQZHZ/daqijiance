package com.fusheng.daqijiance.utils;

import java.util.regex.Pattern;

public class CheckEmail {
    public static boolean isValidEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^([a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+)*$", email);
        }
        return false;
    }
}
