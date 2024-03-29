package main.java;

public class SqLectureThree {
    static class Solution{

        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                int price = prices[i];
                int seconds = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    seconds++;
                    if (price > prices[j]) {
                        break;
                    }
                }
                answer[i] = seconds;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(solution.solution(prices));
    }
}
