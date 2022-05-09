package main.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분검색
 *
 * 임의의 N개의 숫자가 입력으로 주어짐.
 * N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * M이 정렬된 상태에서 몇 번째에 있는지 구하시오.
 * */
public class BinarySearch {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while (lt <= rt) {
            int mid=(lt+rt)/2;
            if (arr[mid] == m) {
                answer=mid+1;
                break;
            } else if (arr[mid] > m) {
                rt=mid-1;
            }else{
                lt=mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }

}
