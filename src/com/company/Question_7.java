package com.company;

//Time Complexity  = O(n)
//Space Complexity = O(1)

public class Question_7 {
    public static String Question_7(String order, String s) {
        int[] freq = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder ans = new StringBuilder("");
        for(int i=0 ; i<order.length() ; i++){
            int idx = (int)(order.charAt(i) - 'a');
            if(freq[idx] != 0){
                while(freq[idx] != 0){
                    ans.append((char)(idx + 'a'));
                    freq[idx]--;
                }
            }
        }
        for(int i=0 ; i<26 ; i++){
            if(freq[i] != 0){
                while(freq[i] != 0){
                    ans.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        String o = "cbafg";
        String q = "abcd";
        System.out.println(Question_7(o,q));
    }
}
