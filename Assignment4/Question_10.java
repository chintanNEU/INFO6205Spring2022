package com.company;

public class Question_10 {
    public int pairSum(ListNode head) {
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = null;
        fast = slow.next;

        while (fast != null) {
            slow.next = next;
            next = slow;
            slow = fast;
            fast = slow.next;
        }
        slow.next = next;
        prev.next = slow;

        int max = Integer.MIN_VALUE;
        fast = slow;
        slow = head;

        while (fast != null) {
            max = Math.max(max, slow.val + fast.val);
            slow = slow.next;
            fast = fast.next;
        }

        return max;
    }

}



