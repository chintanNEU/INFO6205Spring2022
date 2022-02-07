package com.company;

import java.util.*;

//Time Complexity = O(N)
//Space Complexity = O(N + K)
public class Question_5 {
    public static int[] Question_5(int[] nums, int k){

        List<Integer>[] freq = new List[nums.length+1];
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int n : nums) {
            freqMap.put(n ,freqMap.getOrDefault(n, 0 )+1);
        }
        for ( int key: freqMap.keySet()){
            if(freq[freqMap.get(key)] == null){
                freq[freqMap.get(key)] = new ArrayList<>();
            }
            freq[freqMap.get(key)].add(key);
        }
        for ( int i= freq.length -1; i >= 0 && res.size() < k; i--){
            if(freq[i] != null){
                res.addAll(freq[i]);
            }

        }
        return res.stream().mapToInt(i ->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] nums1 = {1};

        System.out.println(Arrays.toString(Question_5(nums, 2)));
        System.out.println(Arrays.toString(Question_5(nums1, 1)));
    }
}