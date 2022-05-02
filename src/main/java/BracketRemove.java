package main.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 입력된 문자열에서 소괄호( ) 사이에 존재하는 모든 문자를 제거하고 남은 문제만 출력하는 프로그램을 작성
 */

public class BracketRemove {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        BracketRemove T = new BracketRemove();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
