package main.java;

import java.util.Scanner;

/**
 * 입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로
 * 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 N = 15이면
 * 7+ 8 = 15
 * 4 + 5 + 6 = 15
 * 1+2+3+4+5 = 15와 같이 총 3가지의 경우가 조냊한다.
 */

public class ContinuousNumbers {
    public int solution(int n) {
        int answer=0;
        int sum= 0;
        int lt =0;
        int m = n/2+1;

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {    //오른쪽 포인터 증가 반복문
            sum += arr[rt]; // 오른쪽 포인터의 값을 sum에 누적
            if(sum==n) answer++; // sum == n이면 answer 증가
            while (sum >= n) { // sum이 n보다 큰 경우 반복
                sum -= arr[lt++]; // 왼쪽 포인터 값을 빼주고 포인터 이동
                if(sum==n) answer++; // 같으면 answer 증가해주고, 증가된 lt 값을 한 번 빼면서 다시 돌아야함.
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousNumbers T = new ContinuousNumbers();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
