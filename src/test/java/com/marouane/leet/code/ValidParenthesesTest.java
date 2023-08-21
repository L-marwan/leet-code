package com.marouane.leet.code;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ValidParenthesesTest {


    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}"})
    void testValidStrings(String s) {
        assertThat(ValidParentheses.isValid(s)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]", "]", "(])"})
    void testInvalidStrings(String s) {
        assertThat(ValidParentheses.isValid(s)).isFalse();

    }

}