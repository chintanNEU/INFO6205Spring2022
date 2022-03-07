package com.company;

public class Question_6 {
    public int countNodes(TreeNode root) {
        int right = rightHeight(root);
        int left = leftHeight(root);
        if(right == left) {
            return (int)Math.pow(2, left) - 1;
        }
        return countNodes(root.right) + countNodes(root.left) + 1;
    }

    public int rightHeight(TreeNode node) {
        int height = 0;
        while(node != null) {
            height++;
            node = node.right;
        }
        return height;
    }

    public int leftHeight(TreeNode node) {
        int height = 0;
        while(node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
}
