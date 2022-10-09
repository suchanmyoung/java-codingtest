package main.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortLectureTwo {
    static class Solution{
        public int[] solution(int[] arr) {
            List<Integer> list = new LinkedList<>();

            for (int i : arr) {
                list.add(i);
            }

            int minValue = Arrays.stream(arr)
                .min()
                .getAsInt();

            for (int i = 0; i < arr.length; i++) {
                if (minValue == arr[i]) {
                    list.remove(i);
                }
            }

            if (list.size() == 0) {
                list.add(-1);
            }

            return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }
}