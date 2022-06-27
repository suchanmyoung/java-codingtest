package main.java;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        double answer = 0;
        int[] arr = {1, 2, 3, 4};

        double v = Arrays.stream(arr).average().orElse(0);
        System.out.println(v);
    }
}
