package com.company;
//Time Complexity :- O(n)
//Space Complexity :- O(1)
public class Question_6 {
    public static ListNode Question_6(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = dummy;

        int count = 0;
        while (count < n) {
            right = right.next;
            count++;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return dummy.next;
    }
}
