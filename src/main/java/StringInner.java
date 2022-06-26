package main.java;

public class StringInner {
    public static void main(String[] args) {
        String s = "Pyy";
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;

        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'p') pCount++;
            if(chars[i] == 'y') yCount++;
        }
        if(pCount == yCount) answer=true;
        System.out.println(answer);
    }
}
