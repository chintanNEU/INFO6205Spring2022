package com.company;

import java.util.Arrays;

public class Question_9 {
    private static int[] Question_9(int[] nums) {
        int[] cnts = new int[201];
        for (int n : nums) {
            cnts[n + 100]++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 201 * cnts[nums[i] + 100] - nums[i] + 100;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100 - nums[i] % 201;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(Question_9(nums)));
    }
}
