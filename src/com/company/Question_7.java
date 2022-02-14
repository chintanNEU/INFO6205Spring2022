package com.company;

//Time Complexity :- O(n)
//Space Complexity :- O(1)
public class Question_7 {
    public static ListNode Question_7(ListNode head) {
        if (head == null) return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode temp = head.next;
        ListNode last = null;

        while (odd != null && even != null) {
            ListNode temp1 = odd.next;
            if (odd.next != null) odd.next = odd.next.next;
            if (temp1.next == null) last = odd;
            if (temp1 != null) odd = temp1.next;

            ListNode temp2 = even.next;
            if (even.next != null) even.next = even.next.next;
            if (temp2 != null) even = temp2.next;
        }

        if (odd != null) odd.next = temp;
        if (odd == null) last.next = temp;

        return head;
    }
}
