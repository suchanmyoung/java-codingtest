package main.java;

public class SelectMiddleWord {
    public static void main(String[] args) {
        String s = "qwer";
        String answer = "";

        char[] chars = s.toCharArray();
        if (chars.length % 2 == 0) {
            for (int i = 0; i < chars.length; i++) {
                if (i == (chars.length / 2) || i == (chars.length/2) - 1) {
                    answer += chars[i];
                }
            }
        }
        else{
            for (int i = 0; i < chars.length; i++) {
                if (i == chars.length / 2) {
                    answer += chars[i];
                }
            }
        }

        System.out.println(answer);
    }

}
