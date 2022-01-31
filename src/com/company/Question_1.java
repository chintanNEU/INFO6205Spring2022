package com.company;
import java.util.*;


//Time Complexity  = O(n)
//Space Complexity = O(1)
public class Question_1 {
    private static int[] Question_1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int zero = -1;
        int two = nums.length;
        int i = 0;
        while (i < two) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                swap(nums, i, two);
            } else {
                zero++;
                swap(nums, i, zero);
                i++;
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
    public static void main(String[] args) {

        int[] nums = { 2, 0, 1, 2, 0, 2, 1, 1};
        System.out.println(Arrays.toString(Question_1(nums)));

    }
}


