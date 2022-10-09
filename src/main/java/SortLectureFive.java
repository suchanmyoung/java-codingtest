package main.java;

import java.util.Arrays;

public class SortLectureFive {
    static class Solution {

        public int solution(int[] citations) {

            Arrays.sort(citations);

            for (int i = 0; i < citations.length; i++) {
                int h = citations.length - i;
                if (citations[i] >= h) {
                    return h;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {3, 0, 6, 1, 5};
            Solution solution = new Solution();
            System.out.println(solution.solution(arr));
        }
    }
}