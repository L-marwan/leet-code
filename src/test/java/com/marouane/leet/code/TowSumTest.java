package com.marouane.leet.code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TowSumTest {

    @ParameterizedTest
    @MethodSource("lists")
    void twoSum(int[] input, int target, int[] expected) {
        assertThat(TowSum.twoSum(input, target)).isEqualTo(expected);
    }

    private static Stream<Arguments> lists() {
        return Stream.of(
                arguments(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                arguments(new int[]{3,2,4}, 6, new int[]{1,2}),
                arguments(new int[]{3,3}, 6,new int[]{0,1})
        );
    }
}