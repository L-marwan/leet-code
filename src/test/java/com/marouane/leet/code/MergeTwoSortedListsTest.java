package com.marouane.leet.code;

import com.marouane.leet.code.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwoSortedListsTest {

    @ParameterizedTest
    @MethodSource("lists")
    void testMerge(ListNode l1, ListNode l2, ListNode expected) {
        var actual = MergeTwoSortedLists.merge(l1, l2);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> lists() {
        return Stream.of(
                arguments(ListNode.of(1, 2, 3), ListNode.of(3, 4, 5), ListNode.of(1, 2, 3, 3, 4, 5)),
                arguments(new ListNode(0), new ListNode(), ListNode.of(0)),
                arguments(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4), ListNode.of(1, 1, 2, 3, 4, 4))
        );
    }


}