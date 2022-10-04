package main.java;

import java.util.*;

public class LinearSearchLectureThree {
    static class Solution{
        public int solution(String skill, String[] skill_trees) {
            return (int) Arrays.stream(skill_trees)
                .map(s -> s.replaceAll("[^" + skill + "]", ""))
                .filter(s -> skill.startsWith(s))
                .count();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution.solution(skill, skill_trees));
    }
}
