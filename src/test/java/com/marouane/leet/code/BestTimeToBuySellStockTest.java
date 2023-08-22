package com.marouane.leet.code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BestTimeToBuySellStockTest {

    private static Stream<Arguments> prices() {
        return Stream.of(
                arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
                arguments(new int[]{7, 6, 4, 3, 1}, 0),
                arguments(new int[]{2,4,1}, 2),
                arguments(new int[]{3,2,6,5,0,3}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("prices")
    void testMaxProfit(int[] prices, int expectedProfit) {
        assertThat(BestTimeToBuySellStock.maxProfit(prices)).isEqualTo(expectedProfit);
    }
}