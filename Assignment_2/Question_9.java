package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Time Complexity = O(M + N)
//Space Complexity = O(M + N)
public class Question_9 {
    public static int[][] Question_9(int[][] A, int[][] B) {

        if(A == null || A.length ==0 ) return new int[0][0];
        if(B == null || B.length ==0 ) return new int[0][0];

        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        int lenA = A.length, lenB = B.length;
        while(i < lenA && j < lenB) {
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);
            if(start <= end) {
                list.add(new int[]{start, end});
            }
            if(A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] num = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] num1 = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] num2 = {{1, 3}, {5, 9}};
        int[][] num3= {};

        System.out.println(Arrays.deepToString(Question_9(num, num1)));
        System.out.println(Arrays.deepToString(Question_9(num2, num3)));
    }
}