package main.java;

import java.util.Scanner;

/**
 * 피보나치 수열을 출력. 앞의 2개의 수를 합해서 다음 숫자가 되는 수열
 * 입력은 피보나치 수열의 총 항의 수 7이 입력되면
 * 1 1 2 3 5 8 13을 출력
 */

public class Main {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
