package com.company;

public class Question_4 {


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) {
            return right;
        } else if(right == null) {
            return left;
        } else {
            return root;
        }
    }
    public static void main(String[] args) {
        // 6,2,8,0,4,7,9,null,null,3,5
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode node = lowestCommonAncestor(root, root.left, root.right);
        System.out.println(node.val);
    }
}


