package main.java;

import java.util.Scanner;

/**
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력
 * 같은 점수가 입력된 경우 높은 등수로 동일 처리
 */

public class koreaExamRank {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        int rank = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
            rank = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        koreaExamRank T = new koreaExamRank();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}