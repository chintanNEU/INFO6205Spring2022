package com.company;


//Time Complexity :- O(n)
//Space Complexity :- O(1)
public class Question_5 {
    public boolean Question_5(ListNode head) {

        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode pre = null, cur = slow, temp;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        ListNode l1 = head, l2 = pre;
        while(l2 != null) {
            if(l2.val != l1.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}
