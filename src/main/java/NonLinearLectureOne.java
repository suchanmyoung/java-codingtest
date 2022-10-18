package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class NonLinearLectureOne {

    static class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if(visited[i]) continue;
                answer++;
                visitAllConnectedComputers(computers, visited, i);
            }

            return answer;
        }
    }

    static void visitAllConnectedComputers(final int[][] computers, boolean[] visited, int c){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(c);
        while (!queue.isEmpty()) {
            int i = queue.poll();
            visited[i] = true;
            for (int j = 0; j < computers[i].length; j++) {
                if (visited[j]) {
                    continue;
                }
                if (computers[i][j] == 1) {
                    queue.offer(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution.solution(3, arr));
    }
}
