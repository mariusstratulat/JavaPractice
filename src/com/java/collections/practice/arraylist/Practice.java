package com.java.collections.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(9);
        nums.add(10);

        // Option 1: using iterator

        Iterator<Integer> numsIt = nums.iterator();

        while(numsIt.hasNext()) {
            Integer num = numsIt.next();

            if(num % 2 != 0) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");
            }
        }

        System.out.println("###########");

        // Option 2: using for each loop
        for(Integer num:nums) {
            if(num % 2 != 0) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");
            }
        }

        System.out.println("###########");
        System.out.println(nums.get(4));
        System.out.println(nums.size());
    }
}
