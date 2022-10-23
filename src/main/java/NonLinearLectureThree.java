package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class NonLinearLectureThree {

    static class Solution{
        class Word {
            String word;
            int depth;

            Word(String w, int d) {
                word = w;
                depth = d;
            }
        }
        public int solution(String begin, String target, String[] words) {
            if (!Arrays.asList(words).contains(target)) {
                return 0;
            }

            int answer = words.length;
            Set<String> used = new HashSet<>();


            Stack<Word> stack = new Stack<>();
            stack.push(new Word(begin, 0));
            while (!stack.isEmpty()) {
                Word now = stack.pop();
                if (now.word.equals(target)) {
                    return now.depth;
                }
                for (String w : words) {
                    if (!changable(now.word, w)) {
                        continue;
                    }
                    if (used.contains(w)) {
                        continue;
                    }
                    used.add(w);
                    stack.push(new Word(w, now.depth + 1));
                }
            }
            return 0;
        }

        boolean changable(String w1, String w2) {
            int len = Math.min(w1.length(), w2.length());
            int count = 0;
            for (int i = 0; i < len && count < 2; i++) {
                if (w1.charAt(i) != w2.charAt(i)) {
                    count++;
                }
            }
            return count == 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution.solution(begin, target, words));
    }
}
