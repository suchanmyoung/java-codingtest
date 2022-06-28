package main.java;

public class CoveringPhone {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < chars.length-4; i++) {
            chars[i] = '*';
        }
        answer = String.valueOf(chars);
        System.out.println(answer);
    }
}
