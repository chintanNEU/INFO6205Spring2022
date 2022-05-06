package com.company;

import java.util.*;

public class Question_3 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!stringAnagramsMap.containsKey(key))
                stringAnagramsMap.put(key, new ArrayList<>());

            stringAnagramsMap.get(key).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }

    public static void main(String[] args) {
        String[] string = {"eat","tea","tan","ate","nat","bat"};
        String[] string1 = {" "};
        String[] string2 = {"a"};
        System.out.println(groupAnagrams(string));
        System.out.println(groupAnagrams(string1));
        System.out.println(groupAnagrams(string2));
    }
}
