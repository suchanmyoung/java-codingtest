package main.java;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Anagram 이란 두 문자열이 알파벳의 나열 순서는 다르지만 구성이 일치하는 것
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램 작성
 */
public class AnagramHashMap {

    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x)==0) return "NO";
            else map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        AnagramHashMap T = new AnagramHashMap();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        System.out.println(T.solution(str1, str2));
    }
}
