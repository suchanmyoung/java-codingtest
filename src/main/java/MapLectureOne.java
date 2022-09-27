package main.java;

import java.util.HashMap;
import java.util.Map;

public class MapLectureOne {
    static class Solution{
        public static int solution(int[] nums) {
            Map<Integer, Boolean> map = new HashMap();

            for (int num : nums) {
                map.put(num, true);
            }

            int max = map.keySet().size();
            int capacity = nums.length / 2;

            return Math.min(max, capacity);
        }

        public static void main(String[] args) {
            int[] num = {3, 1, 2, 3};
            Solution.solution(num);
        }
    }

}
