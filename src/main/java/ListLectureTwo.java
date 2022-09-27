package main.java;

import java.util.Arrays;

public class ListLectureTwo {

    static class Solution{

        public boolean solution(int[] arr) {
            int[] answer = new int[arr.length];

            for(int i=0; i<arr.length; i++){
                answer[i] = i+1;
            }

            Arrays.sort(arr);

            return Arrays.equals(arr, answer);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 1, 3, 2};
        solution.solution(arr);
    }
}
