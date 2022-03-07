package com.company;

public class Question_8 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if(root == null){
            return root;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if(root.val == target && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
}
