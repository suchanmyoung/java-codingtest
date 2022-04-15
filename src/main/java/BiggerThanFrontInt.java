package main.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 첫 줄에 자연수 N이 주어지고
 * 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */

public class BiggerThanFrontInt {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i]> arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        BiggerThanFrontInt T = new BiggerThanFrontInt();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }

    }
}
