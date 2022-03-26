package com.company;

import java.util.LinkedList;
import java.util.List;

public class Question_1 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<String>();
        int left = 0, right = 0;
        for (int i = -1; i < nums.length; i ++) {
            if (i >= 0) {
                left = nums[i] + 1;
                if (left == Integer.MIN_VALUE) {
                    continue;
                }
            }
            else {
                left = lower;
            }
            if (i + 1 < nums.length) {
                right = nums[i + 1] - 1;
                if (right == Integer.MAX_VALUE) {
                    continue;
                }
            }
            else{
                right = upper;
            }
            if (left > right) {
                continue;
            }
            if (left == right) {
                result.add(left + "");
                continue;
            }
            result.add(left + "->" + right);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0 ,1 ,3, 50, 75};
        System.out.println(findMissingRanges(arr, 0, 99));
    }

}
