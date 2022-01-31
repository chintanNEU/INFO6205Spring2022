package com.company;

import java.util.*;

public class Question_10 {
    public static List<String> Question_10(String[] words, int k) {

        if (words == null | words.length == 0) return new ArrayList<>();


        Map<String, Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>();

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (!list.contains(word)) list.add(word);
        }

        Collections.sort(list, (String a, String b) -> {
            int aCount = map.get(a);
            int bCount = map.get(b);
            if (aCount == bCount) {
                return a.compareTo(b);
            } else {
                return bCount - aCount;
            }
        });


        return list.subList(0, k);
    }


    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        System.out.println(Question_10(words,k));
    }
}
