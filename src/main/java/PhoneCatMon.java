package main.java;

import java.util.HashSet;
import java.util.Set;

public class PhoneCatMon {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if(set.size() <= nums.length/2){
            answer = set.size();
        };

        if (set.size() > nums.length/2) {
            answer = nums.length/2;
        }
    }
}
