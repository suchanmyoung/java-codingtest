package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A,B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력
 *
 * 첫 번째 줄에 집합 A의 크기 N
 * 두 번째 줄에 N개의 원소, 원소는 중복되지 않음
 * 세 번째 줄에 집합 B의 크기 M
 * 네 번째 줄에 M개의 원소가 주어짐, 원소는 중복되지 않음
 */

public class TwoPointersAlgorithm2 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;

    }

    public static void main(String[] args) {
        TwoPointersAlgorithm2 T = new TwoPointersAlgorithm2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
