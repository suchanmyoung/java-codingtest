package main.java;

import java.util.HashMap;
import java.util.Map;

public class CantDonePlayer {
    public static void main(String[] args) {
        String[] participant = {"kiki", "leo", "eden"};
        String[] completion = {"eden", "kiki"};

        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            map2.put(completion[i], map2.getOrDefault(completion[i], 0) + 1);
        }

        for (String part : map.keySet()) {
            if(!map.get(part).equals(map2.get(part))) answer = part;
        }

        System.out.println(answer);

    }
}
