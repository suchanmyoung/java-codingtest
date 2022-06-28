package main.java;

import java.util.Arrays;

public class LeastRectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = 0;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int i = 0; i < sizes.length; i++) {
            if(firstMax < sizes[i][0]) firstMax = sizes[i][0];
            if(secondMax < sizes[i][1]) secondMax = sizes[i][1];
        }

        answer = firstMax * secondMax;
    }
}
