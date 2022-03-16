package main.java;

import java.util.Scanner;

/**
 * 한 개 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
 * 문장속의 각 단어는 공백으로 구분된다.
 */
public class LongestString {
//    public String solution(String str) {
//        String answer="";
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m=len;
//                answer=x;
//            }
//        }
//        return answer;
//    }

    public String solution(String str) {
        String answer="";
        int m = Integer.MIN_VALUE;
        int pos;
        while ((pos = str.indexOf(' ')) !=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m=len;
                answer = tmp;
            }
            if(str.length()>m) answer=str;
            str = str.substring(pos + 1);
            //substring의 매개변수가 하나면 그 지점부터 끝까지
        }

        return answer;
    }

    public static void main(String[] args) {
        LongestString T = new LongestString();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
