package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Time Complexity = O(N)
//Space Complexity = O(N)
public class Question_7 {
    public static int[][] Question_7(int[][] intervals, int[]newInterval){
        List<int[]> result = new ArrayList<>();

        for(int[] slot : intervals){
            if (newInterval[1] < slot[0]){
                result.add(newInterval);
                newInterval = slot;
            }
            else if(slot[1] < newInterval[0]){
                result.add(slot);
            }
            else {
                newInterval[0] = Math.min(newInterval[0], slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);

            }
        }
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {6, 9}};
        int[][] nums1 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};

        System.out.println((Arrays.deepToString(Question_7(nums, new int[]{2, 5}))));
        System.out.println((Arrays.deepToString(Question_7(nums1, new int[]{4, 8}))));
    }
}
