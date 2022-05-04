package main.java;

import java.util.*;

/**
 * 공주 구하기
 *
 * 정보 왕국에는 왕자가 N명 있는데, 서로 공주를 구하러 간다 함.
 * 왕은 공주를 구하러 갈 왕자를 결정.
 * 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매김.
 * 그리고 1번 왕자부터 N번 왕자까지 시계방향으로 돌아가며 1부터 시작하여 번호외침.
 * 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원밖.
 * 그리고 다음 왕자부터 다시 1부터 시작하여 번호.
 * 마지막 남은 왕자가 공주를 구하러감
 */
public class SavePrincess {

    public int solution(int n, int k) {
        int answer=0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);
        while (!Q.isEmpty()){
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size()==1) answer=Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        SavePrincess T = new SavePrincess();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n,k));
    }
}
