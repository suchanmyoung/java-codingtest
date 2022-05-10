package main.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직비디오(결정알고리즘)
 * 지니레코드에서는 조영필의 라이브 DVD를 판매하려 함
 * DVD에는 총 N개의 곡이 들어가는데 DVD에 녹화할 때에는 라이브 순서가 유지되어야 한다.
 * 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는 1번과 5번 사이의 곡이 다 들어가야 함.
 * 고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하고
 * DVD의 크기를 최소로 하려고 한다.
 * M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 같은 크기로 함.
 *
 * 첫째 줄에 자연수 N(노래 갯수), M(DVD 갯수)
 * 다음 줄에는 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로 주어짐
 *
 * 첫 번째 줄부터 DVD의 최소 용량 크기
 */

public class DetermineAlgorithm {

    public int count(int[] arr, int capacity) {
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }else sum+=x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int rt = Arrays.stream(arr).sum();
        int lt = Arrays.stream(arr).max().getAsInt();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        DetermineAlgorithm T = new DetermineAlgorithm();
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
