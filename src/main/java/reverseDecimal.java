package main.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후
 * 그 뒤집은 수가 소수이면 출력.
 * 예를 들어 32를 뒤집으면 23, 23은 소수.
 * 단 910을 뒤집으 19로 숫자화(첫 자리부터 연속된 0은 무시)
 */

public class reverseDecimal {

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for(int i=2; i<num; i++)
            if(num%i==0) return false;
        return true;
    }

        public ArrayList<Integer> solution(int n, int[] arr){
            ArrayList<Integer> answer = new ArrayList<>(); // 기존의 int 배열과 return 할 배열의 크기가 다르면 ArrayList

            for(int i=0; i<n; i++){
                int tmp=arr[i];
                int res=0;
                while (tmp > 0) {
                    int t=tmp%10; // tmp를 10으로 나눈 나머지는 1의 자리임
                    res=res*10+t; // res는 자리 단위가 되면서 점차 커짐
                    tmp=tmp/10;
                }
                if(isPrime(res)) answer.add(res);
                System.out.println(isPrime(res));
            }

            return answer;
        }

    public static void main(String[] args) {
        reverseDecimal T = new reverseDecimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        };
    }
}
