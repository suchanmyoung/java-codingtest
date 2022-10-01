package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLectureThreeAgain {
    static class Solution{

        public int solution(String[][] clothes) {
            int answer = 0;

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }

            List<Integer> list = new ArrayList<>();

            for (String s : map.keySet()) {
                list.add(map.get(s) + 1);
            }

            answer = list.stream()
                .reduce((a, b) -> a * b)
                .get()
                .intValue()-1;

            System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}};
        solution.solution(arr);
        };

}
