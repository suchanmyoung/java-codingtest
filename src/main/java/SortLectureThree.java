package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class SortLectureThree {
    static class Solution {

        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                list.add(strings[i].charAt(n) + strings[i]);
            }

            Collections.sort(list);

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i).substring(1);
            }

            return answer;
        }

        public static void main(String[] args) {
            String[] arr = {"sun", "bed", "car"};
            Solution solution = new Solution();
            System.out.println(solution.solution(arr, 1));
        }
    }
}