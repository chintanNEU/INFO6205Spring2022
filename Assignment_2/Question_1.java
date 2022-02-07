package com.company;


//Time Complexity = O(log N)
//Space Complexity = O(1)
public class Question_1 {
    public static int Question_1(int[] nums, int target){
        if (nums == null){
            throw new IllegalArgumentException("Input array is null");
        }

        int len = nums.length;
        if (len == 0 || target <= nums[0]){
            return 0;
        }
        if (target == nums[len - 1 ]){
            return len - 1;
        }
        if (target > nums [len - 1]){
            return len;
        }

        int start = 1;
        int end = len - 1;

        while ( start < end ) {
            int mid = start + (end - start )/ 2;
            if (target == nums[mid]){
                return mid;
            }
            if ( target < nums[mid]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(Question_1(nums, 5));
        System.out.println(Question_1(nums, 2));
        System.out.println(Question_1(nums, 7));
    }

}