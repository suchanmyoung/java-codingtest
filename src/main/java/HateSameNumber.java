package main.java;

import java.util.*;

/**
 *
 * Programmers 같은 숫자는 싫어
 *
 * 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다.
 * 여기서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거.
 * 제거 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지 해야 함.
 */

public class HateSameNumber {
    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int tmpNum = 10;
        for (int num : arr) {
            if(tmpNum != num){
                answer.add(num);
                tmpNum = num;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        HateSameNumber T = new HateSameNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
    }