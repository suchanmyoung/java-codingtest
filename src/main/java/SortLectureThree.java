package main.java;

import java.util.Arrays;

public class SortLectureThree {
    static class Solution {

        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings, (s1, s2) ->{
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            });

            return strings;
        }

        public static void main(String[] args) {
            String[] arr = {"sun", "bed", "car"};
            Solution solution = new Solution();
            System.out.println(Arrays.toString(solution.solution(arr, 1)));
        }
    }
}