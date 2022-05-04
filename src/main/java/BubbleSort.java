package main.java;

import java.util.Scanner;

/**
 * 버블 정렬!
 *
 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램.
 * 정렬 방법은 버블정렬.
 *
 * 버블정렬은 이웃한 두 수를 비교해서
 * 바꿔주면 됨.
 * 1번의 반복에 제일 큰수가 뒤로 가니까,
 * j의 반복횟수는 i가 증가할때마다 줄어야함.
 * i도 끝까지 탐색하는 게 아니라 맨 마지막 전까지만 돌아도 됨.
 */

public class BubbleSort {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort T = new BubbleSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
