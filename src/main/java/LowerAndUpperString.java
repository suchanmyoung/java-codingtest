package main.java;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아
 * 대문자는 소문자로,
 * 소문자는 대문자로,
 * 변화하여 출력하는 프로그램을 작성하세요.
 *
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다.
 * 문자열은 영어 알파벳으로 구성된다.
 */
public class LowerAndUpperString {
    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        LowerAndUpperString T = new LowerAndUpperString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}
