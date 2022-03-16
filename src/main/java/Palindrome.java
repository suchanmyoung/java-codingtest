package main.java;

import java.util.Scanner;

/**
 * 회문 문자열(palindrome)이면 "YES" 아니면 "NO"를 출력
 *
 */

public class Palindrome {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt<rt) {
            if(chars[lt]==chars[rt]) {
                lt++;
                rt--;
            }else{
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
