package com.company;

import java.util.Arrays;


//Time Complexity = O(Nlog N)
//Space Complexity = O(N)
public class Question_8  {
    public static int Question_8(int[][] intervals){

        int cnt = 0;
        if (intervals.length ==0){
            return cnt;
        }

        Arrays.sort(intervals, (a, b) -> (a[0]- b[0]));
        int count =0;
        int end = intervals[0][1];

        for (int i =1; i< intervals.length; i++){
            if(end > intervals[i][0]){
                end = Math.min(end, intervals[i][1]);
                count++;
            }else{
                end = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] num = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] num1 = {{1, 2}, {1, 2}, {1, 2}};
        int[][] num2 = {{1,2}, {2,3}};

        System.out.println(Question_8(num));
        System.out.println(Question_8(num1));
        System.out.println(Question_8(num2));
    }
}