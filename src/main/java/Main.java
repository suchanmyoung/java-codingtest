package main.java;

import java.util.Scanner;

/**
 * A, B 두사람이 가위바위보를 함.
 * N번의 게임을 해서 A가 이기면 A를 출력하고 B가 이기면 B를 출력, 비기면 D
 * 정보는 1:가위, 2:바위, 3:보
 * 첫째 줄에 게임 횟수 N 주어지고
 * 둘째 줄에 A가 낸 가위바위보 정보 N개 주어지고
 * 셋째 줄에 B가 낸 가위바위보 정보 N개 주어짐
 *
 */

public class Main {

    public String solution(int n, int[] arrA, int[] arrB){
        String answer = "";

        for (int i = 0; i < n; i++) {
            if(arrA[i] == arrB[i]) answer += "D";
            else if(arrA[i]==1 && arrB[i] == 3) answer += "A";
            else if(arrA[i]==2 && arrB[i] == 1) answer += "A";
            else if(arrA[i]==3 && arrB[i] == 2) answer += "A";
            else answer += "B";
            }
        return answer;
        }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = kb.nextInt();
        }

        for(char x : T.solution(n, arrA, arrB).toCharArray()){
            System.out.println(x);
        }
    }
}
