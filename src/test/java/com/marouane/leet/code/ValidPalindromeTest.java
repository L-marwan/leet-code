package com.marouane.leet.code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"A man, a plan, a canal: Panama", "  "})
    void isValidPalindrome(String s) {
        assertThat(ValidPalindrome.isPalindrome(s)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"race a car"})
    void isNotValidPalindrome(String s) {
        assertThat(ValidPalindrome.isPalindrome(s)).isFalse();
    }
}