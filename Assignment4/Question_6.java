package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question_6 {
    List<Integer> list = new ArrayList<>();
    Random random;

    public Question_6(ListNode head) {
        ListNode cur = head;
        while(cur!= null){
            list.add(cur.val);
            cur = cur.next;
        }
    }

    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}
