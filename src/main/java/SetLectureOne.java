package main.java;

import java.util.HashSet;
import java.util.Set;

public class SetLectureOne {
    static public class Solution{
        public boolean solution(int[] lotto){
            Set<Integer> set = new HashSet<>();

            for (int i : lotto) {
                set.add(i);
            }

            return set.size() == 6;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lotto = {4, 7, 32, 43, 22, 19};
        solution.solution(lotto);
    }
}
