package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberAdd {
    public static void main(String[] args) {
        int[] numbers = {};

        Set<Integer> set = new HashSet<>();

        int length = numbers.length;
        for (int i = 0; i < length -1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = numbers[i] + numbers[j];
                set.add(temp);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (int j : set) {
            answer[i] = j;
            i++;
        }

        Arrays.sort(answer);
    }
}
