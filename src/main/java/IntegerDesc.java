package main.java;

import java.util.Arrays;

public class IntegerDesc {
    public static void main(String[] args) {
        long n = 118372;
        StringBuilder sb = new StringBuilder();
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        String str = sb.append(chars).reverse().toString();
        long answer = Long.parseLong(str);

        System.out.println(answer);
    }
}
