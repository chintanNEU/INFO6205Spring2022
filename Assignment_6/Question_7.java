package com.company;

public class Question_7 {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode node, int sum) {
        if(node == null) {
            return 0;
        }
        if(node.left == null && node.right == null) {
            return node.val + sum * 10;
        }
        return sumNumbers(node.left, node.val + sum * 10) + sumNumbers(node.right, node.val + sum * 10);
    }
}
