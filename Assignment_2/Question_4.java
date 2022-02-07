package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Time Complexity = O(log N)
//Space Complexity = O(1=n)

public class Question_4 {
    public static int Question_4(int[][] intervals){
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        List<int[]> list = new ArrayList<>();
        for (int [] interval : intervals){
            list.add(new int[]{interval[0], 1});
            list.add(new int[]{interval[1], -1});
        }
        Collections.sort(list, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int res = 0;
        int amount = 0;
        for (int [] arr:list){
            amount = amount +arr[1];
            res = Math.max(amount, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{0,30}, {5,10}, {15,20}};
        int[][] arr2 = {{7,10}, {2,4}};

        System.out.println(Question_4(arr1));
        System.out.println(Question_4(arr2));
    }
}