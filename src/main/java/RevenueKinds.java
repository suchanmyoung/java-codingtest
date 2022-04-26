package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RevenueKinds {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        int lt=0;
        for (int rt = k - 1; rt < n; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt]) - 1);
            if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        RevenueKinds T = new RevenueKinds();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
