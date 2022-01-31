package com.company;


import java.util.ArrayList;

import java.util.List;

//Time Complexity  = O(n)
//Space Complexity = O(1)
public class Question_2 {
    private static List<Integer> Question_2(int[] nums) {
            List<Integer> list = new ArrayList<>();
            if(nums == null) return list;
            int num1=0;
            int num2=0;
            int count1=0;
            int count2=0;
            for(int i=0;i<nums.length;i++){
                int num3 = nums[i];
                if(count1>0 && count2>0){

                    if(num3 == num1){
                        count1++;
                    }else if(num3 ==num2){
                        count2++;
                    }else{
                        count1--;
                        count2--;
                    }

                }else if(count1 >0){

                    if(num3 == num1){
                        count1++;
                    }else{
                        num2 = num3;
                        count2++;
                    }

                }else if(count2>0){

                    if(num3 == num2){
                        count2++;
                    }else{
                        num1 = num3;
                        count1++;
                    }

                }else{
                    num1 = num3;
                    count1++;
                }
            }


            count1=0;
            count2=0;

            for(int i=0;i<nums.length;i++){
                if(nums[i] == num1){
                    count1++;
                }
                else if(nums[i] ==num2){
                    count2++;
                }
            }
            if(count1>nums.length/3){
                list.add(num1);
            }
            if(count2>nums.length/3){
                list.add(num2);
            }

            return list;
        }

    public static void main(String[] args) {
        int[] majority = {3,2,3,2,1,1,1};
        System.out.println(Question_2(majority));
    }
}