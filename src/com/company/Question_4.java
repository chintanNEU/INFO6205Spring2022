package com.company;

//Time Complexity :- O(n)
//Space Complexity :- O(1)
public class Question_4 {
    public static void Question_4(ListNode head) {
        if (head == null) return;


        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode newHead = reverse(slow);


        ListNode left = head;
        ListNode right = newHead;

        while (right.next != null) {
            ListNode temp = left.next;
            left.next = right;
            left = temp;

            ListNode temp2 = right.next;
            right.next = left;
            right = temp2;
        }
    }
    private static ListNode reverse(ListNode slow) {
        if (slow == null) return slow;
        ListNode pre = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        return pre;
    }
}

