package main.java;

import java.util.Scanner;

/**
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
 */
public class sumRowCol {

    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1, sum2; //sum1 = 행의 합, sum2 = 열의 합
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j];    // 행을 고정
                sum2+=arr[j][i];    // 열을 고정
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        sumRowCol T = new sumRowCol();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
