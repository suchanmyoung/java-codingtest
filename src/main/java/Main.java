package main.java;

import java.util.Scanner;

/**
 * 숫자만 추출하기
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 자연수 만듬
 * isDigit
 */
public class Main {
    public int solution(String str){
        int answer=0;
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        for(char aChar : chars){
            if (aChar > 47 && aChar <= 57) {
                sb.append(aChar);
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}
