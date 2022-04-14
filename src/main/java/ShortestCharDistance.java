package main.java;

import java.util.Scanner;

/**
 * 가장 짧은 문자 거리
 * 한 개의 문자열 s와 문자 t가 주어지면
 * 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 출력하는 프로그램
 */

public class ShortestCharDistance {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        ShortestCharDistance T = new ShortestCharDistance();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}
