package main.java;

import java.util.Locale;

public class SortLectureFour {
    static class Solution {

        public String solution(String s) {
            String answer = "";
            String[] split = s.toLowerCase().split("");
            boolean flag = true;

            for (String ss : split) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ") ? true : false;
            }

            return answer;
        }

        public static void main(String[] args) {
            String s = "3people unFollowed me";
            Solution solution = new Solution();
            System.out.println(solution.solution(s));
        }
    }
}