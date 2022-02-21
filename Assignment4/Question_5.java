package com.company;

public class Question_5 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        head = sortList(head);
        tmp = sortList(tmp);

        return merge(head, tmp);
    }

    private ListNode merge(ListNode head, ListNode tmp) {
        ListNode p1 = head;
        ListNode p2 = tmp;
        ListNode tempH = new ListNode(0);
        ListNode h = tempH;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                h.next = p1;
                h = p1;
                p1 = p1.next;
            } else {
                h.next = p2;
                h = p2;
                p2 = p2.next;
            }
        }
        if (p1 != null) {
            h.next = p1;
        }
        if (p2 != null) {
            h.next = p2;
        }
        return tempH.next;
    }
}
