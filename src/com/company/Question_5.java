package com.company;

import java.util.ArrayList;
import java.util.List;


//Time Complexity  = O(log(n) + k)
//Space Complexity = O(1)
public class Question_5 {
    public static List<Integer> Question_5(int[] a, int k, int x) {
        if (a == null || a.length == 0) return new ArrayList<>();

        int l = 0;
        int m = 0;
        int r = a.length - 1;

        while (l + 1 < r) {
            // a slight performance improvement using bitwise operation
            // equivalent to dividing by 2
            m = l + ((r - l) >>> 1);

            if (a[m] == x) break;
            else if (a[m] < x) l = m;
            else r = m;
        }

        if (a[m] == x) m = m;
        else if (a[l] == x) m = l;
        else if (a[r] == x) m = r;
        else if (Math.abs(x - a[l]) <= Math.abs(x - a[r])) m = l;
        else m = r;

        l = r = m;
        while (r - l + 1 < k) {
            if (l - 1 < 0) {
                r++;
            } else if (r + 1 >= a.length) {
                l--;
            } else {
                if (Math.abs(x - a[l - 1]) <= Math.abs(x - a[r + 1])) l--;
                else r++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (l <= r) {
            res.add(a[l]);
            l++;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int x = -1;
        int k = 4;
        System.out.println(Question_5(nums , k , x));
    }

}
