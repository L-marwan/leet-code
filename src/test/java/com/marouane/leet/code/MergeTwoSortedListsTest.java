package com.marouane.leet.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void merge() {
        var l1 = MergeTwoSortedLists.ListNode.of(1,2,3);
        System.out.println(l1);
        var l2 = MergeTwoSortedLists.ListNode.of(3,4,5);
        var expected = MergeTwoSortedLists.ListNode.of(1,2,3,3,4,5);
        assertThat(MergeTwoSortedLists.merge(l1,l2)).isEqualTo(expected);

    }
}