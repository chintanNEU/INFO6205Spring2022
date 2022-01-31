package com.company;

import java.util.Arrays;

//Time Complexity  = O(n log n)
//Space Complexity = O(1)
public class Question_3 {
    public static int Question_3(int[] citations) {
        if (citations == null || citations.length == 0)
            return 0;

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i)
                return citations.length - i;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {3,0,6,1,5};
        System.out.println(Question_3(nums));
    }
}

