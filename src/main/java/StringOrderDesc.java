package main.java;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringOrderDesc {
    public static void main(String[] args) {
        String s = "sfeEDgsd";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        System.out.println(new StringBuilder(new String(chars)).reverse().toString());


        int[] arr = {};

        Stream<int[]> arr1 = Stream.of(arr);
        IntStream stream = Arrays.stream(arr);
    }
}
