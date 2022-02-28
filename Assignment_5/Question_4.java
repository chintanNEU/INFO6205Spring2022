package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question_4 {
    List<Integer> list;
    public List<Integer> largestValues(TreeNode root) {

        list = new ArrayList<>();

        if(root==null){
            return list;
        }
        preorder(root,0);
        return list;

    }

    private void preorder(TreeNode root, int level){

        if(root==null){
            return;
        }

        if(list.size()==level){
            list.add(root.val);
        }else if(list.get(level)<root.val){
            list.set(level,root.val);
        }

        preorder(root.left,level+1);
        preorder(root.right,level+1);
        return;

    }
}
