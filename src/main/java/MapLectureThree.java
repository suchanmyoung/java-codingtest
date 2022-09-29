package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLectureThree {
    static class Solution{

        public int solution(String[][] clothes) {
            Map<String, Integer> map = new HashMap<>();

            for (String[] cloth : clothes) {
                String clothType = cloth[1];
                map.put(clothType, map.getOrDefault(clothType, 0) + 1);
            }

            List<Integer> list = new ArrayList<>();

            for (String s : map.keySet()) {
                list.add(map.get(s) + 1);
            }

            return list.stream()
                .reduce((a, b) -> a * b)
                .get()
                .intValue() - 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}};
        System.out.println(solution.solution(arr));
    }
}
