package main.java;

public class AddDigits {
    public static void main(String[] args) {
        int n = 123;
        char[] chars = String.valueOf(n).toCharArray();
        int answer = 0;
        for (int i = 0; i < chars.length; i++) {
            answer += Character.getNumericValue(chars[i]);
        }
        System.out.println(answer);
    }
}
