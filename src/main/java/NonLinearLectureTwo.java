package main.java;

public class NonLinearLectureTwo {

    static class Solution {
        public int solution(int[] numbers, int target) {
            return sumCount(numbers, target, 0, 0);
        }

        int sumCount(final int[] numbers, final int target, int i, int sum) {
            if (i == numbers.length) {
                if (sum == target) {
                    return 1;
                }
                return 0;
            }

            return sumCount(numbers, target, i + 1, sum + numbers[i]) +
            sumCount(numbers, target, i + 1, sum - numbers[i]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        System.out.println(solution.solution(numbers, 3));
    }
}
