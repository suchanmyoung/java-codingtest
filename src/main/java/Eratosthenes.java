package main.java;

import java.util.Scanner;

/**
 * 에라토스테네스 체
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램
 */

public class Eratosthenes {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j=i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Eratosthenes T = new Eratosthenes();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
