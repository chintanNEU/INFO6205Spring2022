package com.company;

//Time Complexity :- O(n)
//Space Complexity :- O(n)
public class Question_9 {
    public Node Question_9(Node head, int insertVal){
        Node node = new Node(insertVal);
        if(head == null) {
            node.next = node;
            return node;
        }

        Node currentNode = head;
        while(currentNode.next != head) {
            int currentVal = currentNode.val;
            int nextVal = currentNode.next.val;
            if(currentVal <= insertVal && nextVal >= insertVal) {
                break;
            } else if(currentVal > nextVal) {
                if(currentVal >= insertVal && nextVal >= insertVal) {
                    break;
                }
                if(currentVal <= insertVal && nextVal <= insertVal) {
                    break;
                }
            }
            currentNode = currentNode.next;
        }
        Node temp = currentNode.next;
        currentNode.next = node;
        node.next = temp;
        return head;
    }

}

