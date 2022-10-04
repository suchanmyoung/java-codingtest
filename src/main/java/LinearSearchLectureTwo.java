package main.java;

public class LinearSearchLectureTwo {
    static class Solution{
        public boolean solution(String s) {
            char[] chars = s.toCharArray();
            int pCount = 0;
            int yCount = 0;

            for (char aChar : chars) {
                if (aChar == 'p' || aChar == 'P') {
                    pCount++;
                }

                if (aChar == 'y' || aChar == 'Y') {
                    yCount++;
                }
            }

            if (pCount == 0 && yCount == 0) {
                return false;
            }

            return pCount == yCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pPoooyY";
        System.out.println(solution.solution(s));
    }
}
