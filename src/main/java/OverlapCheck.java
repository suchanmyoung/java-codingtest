package main.java;

import java.util.Scanner;

/**
 * 현수네 반에는 N명의 학생들이 있음.
 * 선생님은 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어내
 * N명의 학생들이 찍어낸 숫자들 중에 중복된 숫자가 존재하면 D를 출력
 * N명이 모두 각자 다른 숫자를 적어냈다면 U를 출력
 */

public class OverlapCheck {

    public char solution(int n, int[] arr) {

        /**
         * Map으로 풀기
        Map<Integer, Integer> map = new HashMap();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) >= 2) {
                return 'D';
            }
        }
         */

        char answer='U';
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) return 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        OverlapCheck T = new OverlapCheck();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
