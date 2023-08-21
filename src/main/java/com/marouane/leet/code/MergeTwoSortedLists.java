package com.marouane.leet.code;

public class MergeTwoSortedLists {

    public static ListNode merge(ListNode list1, ListNode list2) {
        return ListNode.of(1,5);
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
                s += node.val + ", ";
                node = node.next;
            }
            return s+"]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj instanceof ListNode other) {
                if (this.next == null) {
                    return this.val == other.val;
                }else{
                    return this.val == other.val && this.next.equals(other.next);
                }
            }
            return false;
        }

        static ListNode of(int... elements) {
            ListNode preHead = new ListNode();
            ListNode last = preHead;
            for (int i : elements) {
                last.val = i;
                last.next = new ListNode();
                last = last.next;
            }
            return preHead.next ;
        }
    }
}
