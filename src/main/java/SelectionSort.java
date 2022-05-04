package main.java;

import java.util.Scanner;

/**
 * 선택정렬!
 *
 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력
 * 정렬하는 방법은 선택정렬
 * 첫 번째 줄에 자연수 N이 주어지고 두번째 줄에 자연수 N개가 주어짐.
 *
 * i가 0일 때 j 첨부터 끝까지 비교해서 제일 작은 숫자를 맨 앞
 * index 를 "선택" 해서 비교하고 "최소값"을 두는 방식!
 */
public class SelectionSort {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx=i;
            for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j]<arr[idx]) idx=j;
                }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
            }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(arr)){
            System.out.print(x + " ");
        }
    }
}
