package main.java;

public class ReverseIntegerToArray {
    public static void main(String[] args) {
        long n = 12345;
        StringBuilder sb = new StringBuilder();
        char[] chars = sb.append(n).reverse().toString().toCharArray();
        int[] answer = new int[chars.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.getNumericValue(chars[i]);
        }
    }
}
