package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class WhatIsK {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1, 7,3}};
        int[] answer = new int[commands.length];

        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr.add(array[j]);
            }
            Collections.sort(arr);
            int integer = arr.get(commands[i][2]-1);
            answer[i] = integer;
            arr.clear();
        }
    }
}
