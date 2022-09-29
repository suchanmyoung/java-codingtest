package main.java;

import java.util.HashMap;
import java.util.Map;

public class MapLectureTwo {
    static class Solution{

        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> map = new HashMap<>();

            for (String people : participant) {
                map.put(people, map.getOrDefault(people, 0)+1);
            }

            for (String comp : completion) {
                if (map.get(comp) >= 1) {
                    map.put(comp, map.getOrDefault(comp, 0) - 1);
                }
            };

            for (String str : map.keySet()) {
                if (map.get(str) != 0) {
                    answer = str;
                }
            }

            return answer;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"leo", "kiki", "eden", "kiki"};
        String[] completion = {"eden", "leo", "kiki"};
        System.out.println(solution.solution(participant, completion));
    }
}
