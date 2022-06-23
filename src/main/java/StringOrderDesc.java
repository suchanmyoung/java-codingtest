package main.java;

import java.util.Arrays;

public class StringOrderDesc {
    public static void main(String[] args) {
        String s = "sfeEDgsd";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        System.out.println(new StringBuilder(new String(chars)).reverse().toString());

    }
}
