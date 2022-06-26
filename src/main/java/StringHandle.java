package main.java;

import java.util.regex.Pattern;

public class StringHandle {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "1234";

        if(s.length() != 4) answer=false;

        String pattern = "^[0-9]*$";
        if(!Pattern.matches(pattern, s)) answer=false;
    }
}
