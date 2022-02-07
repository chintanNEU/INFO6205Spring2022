package com.company;

import java.util.Arrays;

//Time Complexity = O(N^2)
//Space Complexity = O(N)
public class Question_6 {
    public static int Question_6(int[] nums, int target) {
        Arrays.sort(nums);
        var closest = 0;


        for (int i = 0,n = nums.length, minDiff = Integer.MAX_VALUE;i < n-2; i++){
            var j = i + 1;
            var k = n - 1;

            while(j < k ) {
                var sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    j++;
                } else k--;

                var diff = Math.abs(target - sum);
                if(diff < minDiff){
                    minDiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int[] nums1 = {0, 0, 0};
        System.out.println(Question_6(nums, 1));
        System.out.println(Question_6(nums1, 1));
    }

}