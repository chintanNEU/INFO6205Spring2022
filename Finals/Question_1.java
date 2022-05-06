package com.company;

public class Question_1 {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char pre = str.charAt(0);
        int count = 1, len = str.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < len; i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) != pre) {
                sb.append("" + pre + count);
                pre = ch;
                count = 1;
            } else {
                count++;
            }
        }
        sb.append("" + pre + count);

        String res = sb.toString();
        if (res.length() >= len) {
            return str;
        }

        return res;

    }

    public static void main(String[] args) {
        // write your code here
        String s1 = "aabcccccaaa";
        String s2 = "ab";
        System.out.println(compressString(s1));
        System.out.println(compressString(s2));
    }
}

