package main.java;

import java.util.Scanner;

/**
 * 현수아빠는 현수에게 N일 동안의 매출 기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구해
 * N=10이고 10일 간의 매출 기록이 아래와 같음. 이때 K=3이라면
 * 12 15 11 20 25 10 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원이다.
 *
 * 첫 줄에 N과 K가 주어짐
 * 두 번째 줄에 N개의 숫자열.
 *
 * 내가 푼 방식은 Time Limit...
 * Sliding Window 방식으로 풀어야함
 * 이중 포문 돌면(On2) 시간복잡도임
 */
public class SlidingWindow {

    public int solution(int k, int[] arr) {
        int answer =0;
        int initialWindow = 0;
        for (int i=0; i < k; i++) {
            initialWindow += arr[i];
        }

        for (int i = k; i <= arr.length; i++) {
            if(initialWindow > answer) answer = initialWindow;
            initialWindow = initialWindow + arr[i] - arr[i - k];
        }

        return answer;
    }

    public static void main(String[] args) {
        SlidingWindow T = new SlidingWindow();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(k, arr));
    }

}
