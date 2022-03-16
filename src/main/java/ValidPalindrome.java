package main.java;

import java.util.Scanner;

/**
 * Palindrome이면 YES, 아니면 NO
 * 단, 알파벳 이외의 문자들을 무시한다.
 * replaceAll!!!
 */
public class ValidPalindrome {
    public String solution(String str) {
        String answer = "YES";
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isAlphabetic(aChar)){
                sb.append(aChar);
            }
        }
        str = sb.toString().toUpperCase();
        if(!str.equals(sb.reverse().toString().toUpperCase()))
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        ValidPalindrome T = new ValidPalindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
