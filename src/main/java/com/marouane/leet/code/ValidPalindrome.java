package com.marouane.leet.code;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(
                "[^a-zA-Z0-9]", "");
        var s2 = new StringBuilder(s).reverse().toString();

        return s.equals(s2);
    }
}
