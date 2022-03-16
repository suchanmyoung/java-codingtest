package main.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * StringBuilder 이용해서 단어 뒤집기,
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
 * 첫 줄에 자연수 N이 주어지고
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어진다. (알파벳)
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력
 */
public class UsageStringBuilder {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        UsageStringBuilder T = new UsageStringBuilder();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

}
