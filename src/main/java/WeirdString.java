package main.java;

public class WeirdString {
    public static void main(String[] args) {
        String s = "try hello world";
        String[] split = s.split(" ");
        char[] chars;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            chars = split[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if(j%2 == 0){
                   chars[j] =  Character.toUpperCase(chars[j]);
                }else{
                    chars[j] = Character.toLowerCase(chars[j]);
                }
            }
            sb.append(chars);
            sb.append(" ");
        }

        String answer = sb.toString();
        answer = answer.substring(0, answer.length()-1);
        System.out.println(answer);
    }
}
