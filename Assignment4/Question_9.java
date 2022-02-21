package com.company;

import java.util.HashSet;
import java.util.Set;

public class Question_9 {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> h = new HashSet<>();
        for(int num : nums) {
            h.add(num);
        }
        int count = 0,set = 0;
        while(head != null) {
            if(h.contains(head.val)) {
                set = 1;
            }else if(set == 1) {
                count++;
                set = 0;
            }
            head = head.next;
        }
        return set==1?count+1:count;

    }
}
