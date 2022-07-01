package main.java;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                sb.append(chars[i]);
            }
            if(chars[i] > 64 && chars[i] < 91){
                if(chars[i] + n > 90){
                    sb.append((char)(chars[i] + n - 26));
                }else{
                    sb.append((char) (chars[i] + n));
                }
            }else if(chars[i] > 96 && chars[i] < 123){
                if(chars[i] + n > 122){
                    sb.append((char) (chars[i] + n - 26));
                }else{
                    sb.append((char) (chars[i] + n));
                }
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
