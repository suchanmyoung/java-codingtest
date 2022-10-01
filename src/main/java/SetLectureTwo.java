package main.java;

import java.util.HashSet;
import java.util.Set;

public class SetLectureTwo {
    static class Solution{

        public boolean solution(String[] words) {
            boolean answer = true;

            Set<String> set = new HashSet<>();
            char previous;
            char next;

            for (int i = 0; i < words.length-1; i++) {
                if (!set.add(words[i])) {
                    return false;
                }

                previous = words[i].charAt(words[i].length() - 1);
                next = words[i + 1].charAt(0);

                if (previous != next) {
                    return false;
                }
             }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream"};
        solution.solution(words);
    }
}
