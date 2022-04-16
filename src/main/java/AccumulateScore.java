package main.java;

import java.util.Scanner;

/**
 * OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제
 * 여러 개의 OX로 만든 시험에서 연속으로 답을 맞히면 가산점을 준다.
 * 1번 문제가 맞은 경우에는 1점, 틀리다가 다시 맞으면 1점
 * 연속으로 맞을 경우 2점, 3점으로 계산
 * 틀린 문제는 0점
 * 10개의 OX 문제에서 답이 맞은 경우에는 1로 표시하고 틀리면 0
 *
 * 첫째 줄에 문제의 개수 N이 주어짐
 * 둘째 줄에는 N개 문제의 채점 결과
 */
public class AccumulateScore {
    public int solution(int[] arr){
        int answer=0;
        int cnt=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else if (arr[i] == 0) {
                cnt=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AccumulateScore T = new AccumulateScore();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr));
    }
}
