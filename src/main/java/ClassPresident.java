package main.java;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장 후보로 A,B,C,D,E 후보가 등록
 * 첫 줄레 N이 주어지고 둘째 줄에 문자열로 나열
 *
 * 가장 많은 투표를 받은 기호를 출력
 */

public class ClassPresident {

    public char solution(int n, String s) {
        char answer=' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ClassPresident T = new ClassPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}
