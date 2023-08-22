package com.marouane.leet.code;

public class MergeTwoSortedLists {

    public static ListNode merge(ListNode list1, ListNode list2) {
        var result = new ListNode();
        var lastPointer = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                lastPointer.next = list1;
                list1 = list1.next;
            } else {
                lastPointer.next = list2;
                list2 = list2.next;
            }
            lastPointer = lastPointer.next;
        }

        if (list1 == null) {
            lastPointer.next = list2;
        } else {
            lastPointer.next = list1;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            var s = "[";
            var node = this;
            while (node != null) {
                s += node.val;
                if (node.next != null)
                    s += ", ";
                node = node.next;
            }
            return s + "]";
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;
            if (obj instanceof ListNode node2) {
                var node1 = this;

                while (node1 != null && node2 != null) {
                    if (node1.val != node2.val)
                        return false;
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return true;
            }
            return false;
        }

        static ListNode of(int... elements) {
            if (elements.length == 0)
                return new ListNode(0);
            ListNode preHead = new ListNode();
            ListNode last = preHead;
            for (int i : elements) {
                last.next = new ListNode(i);
                last = last.next;
            }
            return preHead.next;
        }
    }
}
