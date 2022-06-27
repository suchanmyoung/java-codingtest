package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ResultReport {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] answer = new int[id_list.length];

        Map<String, Integer> idxMap = new HashMap<>();
        Map<String, HashSet<String>> reportMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idxMap.put(id_list[i], i);
            reportMap.put(id_list[i], new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            String to = split[1];
            String from = split[0];

            reportMap.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = reportMap.get(id_list[i]);
            if(send.size() >= k){
                for (String s : send) {
                    answer[idxMap.get(s)]++;
                }
            }
        }
    }
}
