package main.java;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호가 입력되면 올바른 괄호이면 "YES" 올바르지 않으면 "NO"를 출력
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만 (()()))) 이것은 올바른 괄호가 아니다
 * Stack = LIFO(Last In First Out)
 * Queue = FIFO(First In First Out)
 */

public class RightBracket {

    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x == '('){
                stack.push(x);
            }else{
                if(stack.isEmpty()) return "NO"; // 비어 있는 거 만나면 바로 괄호 안맞으니까 return NO 해줌
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        RightBracket T = new RightBracket();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
