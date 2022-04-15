package main.java;
import java.util.Scanner;

/**
 * 선생님이 N명의 학생을 일렬로 세움
 * 학생의 키가 앞에서부터 순서대로 주어짐.
 * 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하기
 * (학생이 자기 앞에 서 있는 학생보다 크면 보임, 작거나 같으면 안 보임)
 */

public class TeachersArray {
    public int solution(int n, int[] arr) {
        int answer=1;
        int max=arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TeachersArray T = new TeachersArray();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
