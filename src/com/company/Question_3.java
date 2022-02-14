package com.company;

//Time Complexity :- O(nlogK)
//Space Complexity :- O(1)
public class Question_3 {
    public ListNode Question_3(ListNode[] lists) {

        if (lists.length < 1) return null;

        int k = lists.length;
        while (k > 1) {
            int j = 0;
            for (int i = 0; i < k; i += 2) {
                if (i == k - 1) {
                    lists[j++] = lists[i];
                } else {

                    lists[j++] = merge2Lists(lists[i], lists[i + 1]);
                }
            }
            k = j;
        }
        return lists[0];
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 == null ? l2 : l1;
        return dummyHead.next;
    }
}
