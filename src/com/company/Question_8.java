package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time Complexity  = O(n)
//Space Complexity = O(n)
public class Question_8 {
    public List<Integer> Question_8(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length, largest = n;
        int index = 0;

        for (int i = 0; i < n; i++) {
            index = find(arr, largest);
            flip(arr, index);
            flip(arr, largest - 1);
            result.add(index + 1);
            result.add(largest);
            largest--;
        }
        return result;
    }

    private int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private void flip(int[] arr, int index) {
        int i = 0, j = index;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}


