package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class reportResult {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>()); // 신고 받은 유저들을 Set으로 관리
            idxMap.put(name, i); // 각 유저의 번호
        }

        for (String s : idxMap.keySet()) {
            System.out.println("idxMap keySet : " + s);
        }

        for (int s : idxMap.values()) {
            System.out.println("idxMap values : " + s);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from); // 신고 받은 유저가 key, value는 신고한 Unique 유저
        }

        for (String s : map.keySet()) {
            System.out.println("map keySet : " + s);
        }

        for (HashSet<String> value : map.values()) {
            System.out.println("map values : " + value);
        }

        /**
         * map을 순회하면서 set의 사이즈가 k(정지 신고수) 이상인지 확인.
         * set은 신고당한 Unique 횟수.
         * idxMap(유저번호)에 맞게 끔 신고한 Id에 누적값 1씩 증가
         */
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }

        Arrays.stream(answer).forEach(System.out::print);
    }
}
