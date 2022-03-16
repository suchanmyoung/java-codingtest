package main.java;

import java.util.Scanner;

/**
 * 중복문자제거
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력
 */
public class RemoveDuplicatedChar {
    public String solution(String str){
       String answer="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) {
                answer += str.charAt(i);
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicatedChar T = new RemoveDuplicatedChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}
