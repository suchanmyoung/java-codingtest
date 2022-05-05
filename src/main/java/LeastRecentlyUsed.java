package main.java;

import java.util.Scanner;

/**
 * LRU(Least Recently Used) 가장 최근에 사용되지 않은 것
 * 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하는 알고리즘
 *
 * 캐시 사이즈가 5이고 작업이 2 3 1 6 7 순으로 저장되어 있다면
 * (맨 앞이 가장 최근에 쓰인 작업, 맨 뒤는 가장 오랫동안 쓰이지 않은 작업)
 *
 * 해야 할 작업이 캐시에 없는 상태로 새로운 작업인 5번 작업을 CPU가 사용하면,
 * 모든 작업이 뒤로 밀리고 5번 작업은 캐쉬의 맨앞
 * 5 2 3 1 6 (7 제거)
 *
 * 해야할 작업이 캐시에 있는 상태로 위 상태에서 3번 작업을 CPU가 하면
 * 3번이 맨앞 위치
 * 3 5 2 1 6
 *
 * 첫 번째 줄에 캐시의 크기인 S,
 * 두 번째 줄에 작업의 개수가 입력됨.
 * 두 번째 줄에 N개의 작업번호가 처리순으로 주어짐
 */
public class LeastRecentlyUsed {

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos=-1;
            for(int i=0; i<size; i++) if(x==cache[i]) pos=i;
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            else{
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }


        return cache;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
