package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(root, 0, ret);
        Collections.reverse(ret);
        return ret;
    }

    private void helper(TreeNode root, int level, List<List<Integer>> ret) {
        if (root != null) {
            if (level == ret.size()) {
                ret.add(new ArrayList<>());
            }
            ret.get(level).add(root.val);
            helper(root.left, level+1, ret);
            helper(root.right, level+1, ret);
        }
    }
}
