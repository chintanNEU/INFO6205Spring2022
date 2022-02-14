package com.company;

//Time Complexity :- O(max(m,n))
//Space Complexity :- O(max(m,n))
public class Question_1 {

    public ListNode Question_1(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;

        while ( p != null || q != null){
            int x = (p != null) ? (int) p.val : 0;
            int y = (p != null) ? (int) q.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if ( p != null  ){
                p = p.next;
            }
            if ( q != null ){
                q = q.next;
            }

        }
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
      return dummyHead.next;
    }

}
