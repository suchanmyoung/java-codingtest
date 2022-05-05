package main.java;

import java.util.*;

/**
 * 장난꾸러기
 * 철수네 반에는 N명의 학생들이 있음.
 * 반 학생들을 일렬로 키작은 순으로 일렬로 세움
 * 제일 앞(가장 작은) 학생부터 1반 번호를 1번부터 N번까지 부여.
 * 철수는 짝궁보다 키가 크지만 앞 번호를 받고 싶어 짝궁과 자리 바꿈.
 *
 * 철수와 짝궁이 자리를 바꾼 반 학생들의 일렬로 서 있는 키 정보가 주어질때
 * 철수가 받은 번호와 철수 짝궁이 받은 번호를 차례로 출력
 */
public class Mischief {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != arr2[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Mischief T = new Mischief();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
