package main.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfsPractice {

    public static class Solution {
        int[][] matrix;
        boolean[] isVisited;
        public void solution(int[][] matrix, int rootNode) {
            this.matrix = matrix;
            isVisited = new boolean[matrix.length];

            System.out.println("DFS!");
            dfs(rootNode);

            System.out.println();
            System.out.println("BFS!");
            bfs(rootNode);
        }

        private void bfs(int rootNode) {
            isVisited = new boolean[matrix.length];
            Queue<Integer> queue = new LinkedList<>();

            queue.offer(rootNode);
            while (!queue.isEmpty()) {
                Integer poll = queue.poll();
                isVisited[poll] = true;
                System.out.print(poll + " ");
                for (int i = 1; i < matrix.length; i++) {
                    if (isVisited[i] == false && matrix[poll][i] == 1) {
                        queue.offer(i);
                        System.out.print(i + " ");
                    }
                }
            }
        }

        private void dfs(int index) {
            isVisited[index] = true;
            System.out.print(index + " ");

            for (int i = 1; i < matrix.length; i++) {
                if (isVisited[i] == false && matrix[index][i] == 1) {
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int node = scanner.nextInt();
        int edge = scanner.nextInt();
        int rootNode = scanner.nextInt();

        int[][] matrix = new int[node + 1][node + 1];

        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        Solution solution = new Solution();
        solution.solution(matrix, rootNode);
    }

    /**
     * 4 5 1
     * 1 2
     * 1 3
     * 1 4
     * 2 4
     * 3 4
     */
}
