package main.java;

import java.util.Scanner;

/**
 * 재귀함수를 이용해서 10진수 N을 이진수로 변환하여 출력
 */
public class BinaryNumber {

    public void recursive(int n) {
        if (n == 0) return;
        else{
            recursive(n / 2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        BinaryNumber T = new BinaryNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        T.recursive(n);
    }
}
