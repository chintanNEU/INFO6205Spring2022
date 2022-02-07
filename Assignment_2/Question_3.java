package com.company;

//Time Complexity = O(log N)
//Space Complexity = O(1)
public class Question_3 {
    public static int Question_3(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        if (nums[right] > nums[0]) {
            return nums[0];

        }

        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {11, 13, 15, 17};

        System.out.println(Question_3(nums));
        System.out.println(Question_3(nums1));
        System.out.println(Question_3(nums2));
    }
}
