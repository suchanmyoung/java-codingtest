package main.java;

import java.util.Scanner;

/**
 * 재귀함수
 *
 * 자연수 N이 입력되면 재귀함수를 이용해 1부터 N까지 출력
 */
public class RecursiveBasic {
    public void recursive(int n) {
        if(n < 1) return;
        recursive(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        RecursiveBasic T = new RecursiveBasic();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        T.recursive(n);
    }
}
