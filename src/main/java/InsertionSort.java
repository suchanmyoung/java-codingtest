package main.java;

import java.util.Scanner;

/**
 * 삽입정렬!
 *
 * i를 1부터 시작하고,
 * j를 i-1로 시작해서 j-- 하면서 계속 비교..
 *
 * 내가 하는 수찬정렬에서 반대로 j++ 하면서 가는거.
 */


public class InsertionSort {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }

        /**
         * 수찬 정렬
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
         */
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort T = new InsertionSort();
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
