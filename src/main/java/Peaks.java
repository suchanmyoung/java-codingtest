package main.java;

import java.util.Scanner;

/**
 * 지도 정보가 N*N의 격자판 위에 주어짐.
 * 각 격자에는 그 지역의 높이가 쓰여있음.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역
 * 봉우리 지역이 몇 개 있는지 알아내는 프로그램
 *
 * 격자의 가장자리는 0으로 초기화.
 */
public class Peaks {
    //x축의 이동이 되는 dx와 y축의 이동이 되는 dy를 지정
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};


    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                //k는 x,y축을 이동하는 숫자
                for (int k = 0; k < 4; k++) {
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Peaks T = new Peaks();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
  }

