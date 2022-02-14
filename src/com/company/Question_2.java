package com.company;

import java.util.HashMap;

//Time Complexity :- O(n)
//Space Complexity :- O(n)
public class Question_2 {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        HashMap<Node, Node> hm = new HashMap<>();
        Node dummyHead = new Node(0);
        Node cur1 = head;
        Node cur2 = dummyHead;

        while (cur1 != null) {
            Node a = new Node(cur1.val);
            cur2.next = a;
            hm.put(cur1, a);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        cur1 = head;
        cur2 = dummyHead.next;

        while (cur1 != null) {
            cur2.random = hm.get(cur1.random);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return dummyHead.next;

    }
}
