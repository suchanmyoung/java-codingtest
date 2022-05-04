package main.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기를 레이저로 자르기 stack
 */

public class IronLazer {

    public int solution(String str){
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        IronLazer T = new IronLazer();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
