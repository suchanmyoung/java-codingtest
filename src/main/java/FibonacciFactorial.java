package main.java;

import java.util.Scanner;

/**
 * 피보나치 재귀(메모이제이션 - 컴퓨터 프로그램이 동일한 계산을
 * 반복할 때 계산한 값을 메모리에 저장하는 것)
 */

public class FibonacciFactorial {
    public int recursive(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return recursive(n-2) + recursive(n-1);
    }

    public static void main(String[] args) {
        FibonacciFactorial T = new FibonacciFactorial();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int i=1; i<=n; i++) System.out.print(T.recursive(i) + " ");
    }
}
