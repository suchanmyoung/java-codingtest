package main.java;

import java.util.ArrayList;
import java.util.Scanner;



public class TwoPointersAlgorithm {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1 < n && p2 < m) {
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        TwoPointersAlgorithm T = new TwoPointersAlgorithm();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = kb.nextInt();
        }

        for (int x : T.solution(n, m, arrA, arrB)) {
            System.out.print(x + " ");
        }
    }
}
