package main.java;

import java.util.Scanner;

/**
 * N개의 수로 이루어진 수열이 주어짐
 * 이 수열에서 연속 부분 수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구해라
 *
 * 만약 N=8이고 M=6이고 수열이 1 2 1 3 1 1 1 2면
 * 합이 6이 되는 연속 부분 수열은 {2,1,3}, {1,3,1,1} {3,1,1,1}로 세개임
 */
public class Main {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum =0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt]; //rt를 증가시키면서 sum에누적
            if(sum==m) answer++; //sum이 m값과 같으면 answer++
            while (sum >= m) { // sum이 m보다 크거나 같을 동안 계속 반복
                sum -= arr[lt++]; // sum에서 arr[lt] 값을 빼고 lt를 더함
                if(sum==m) answer++; // 만약 sum==m이 되면 answer을 더하고, while문 나감
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr));
    }
}
