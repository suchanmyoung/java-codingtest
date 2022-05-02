package main.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑
 * 게임 개발자 조르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 한다.
 * 게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각형,
 * 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있다.
 * 각 격자 칸에는 인형이 들어 있으며 인형이 없는 칸은 빈칸.
 * 모든 인형은 1 x 1 크기의 격자 한 칸을 차지하고 아래 칸부터 차곡차곡 쌓임
 * <p>
 * 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올림.
 * 집어 올린 인형은 바구니에 쌓이는데, 같은 인형 모양의 인형 두 개가
 * 연속해서 바구니에 쌓이면 두 인형은 터지면서
 */
public class KakaoStack {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][pos-1]!=0){ // 행과 열에 맞는 인형이 있으면 !
                    int tmp=board[i][pos-1]; // tmp에 인형 값을 저장하고
                    board[i][pos-1]=0; // 해당 위치의 인형을 제거
                    if(!stack.isEmpty() && tmp==stack.peek()){ // 스택이 비어있지 않고, 맨 위의 스택과 방금 꺼낸 인형이 같으면
                        answer+=2; // answer 2 적립하면서
                        stack.pop(); // stack 을 없애줌
                    }
                    else stack.push(tmp); // 스택이 비어있거나 스택의 값이 다르면 스택에 넣어줌
                    break; // 인형을 발견했는데도 아무 조건에 안 맞으면, 다음 for 문으로 넘어감
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        KakaoStack T = new KakaoStack();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves= new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}
