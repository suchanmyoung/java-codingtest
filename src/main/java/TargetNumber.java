package main.java;

public class TargetNumber {

    public static class Solution {
        int answer = 0;
        public int solution(int[] numbers, int target) {
            return dfs(numbers, target, 0, 0);
            }

        private int dfs(int[] numbers, int target, int i, int sum) {
            if (i == numbers.length) {
                if (sum == target) {
                    return 1;
                }
                return 0;
            }

            return dfs(numbers, target, i + 1, sum + numbers[i])
                + dfs(numbers, target, i + 1, sum - numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers, 3));
    }

}
