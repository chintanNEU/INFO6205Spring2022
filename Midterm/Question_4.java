package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_4 {
        public static int[][] mergeIntervals(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }

            Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

            List<int[]> result = new ArrayList<>();
            for (int[] interval : intervals) {

                if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                    result.add(interval);
                } else {

                    result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
                }
            }

            return result.toArray(new int[result.size()][]);
        }



    public static void main(String[] args) {
        int [][] arr = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(mergeIntervals(arr)));
    }
}
