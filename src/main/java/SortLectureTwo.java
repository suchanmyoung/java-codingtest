package main.java;

import java.util.Arrays;

public class SortLectureTwo {
    static class Solution{
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return new int[]{-1};
            }

            int min = Arrays.stream(arr)
                .min()
                .getAsInt();

            return Arrays.stream(arr)
                .filter(a -> a != min)
                .toArray();
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }
}