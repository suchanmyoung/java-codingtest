package main.java;

public class Watermelon {
    public static void main(String[] args) {
        int n = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if(i%2 == 0){
                sb.append("박");
            }else {
                sb.append("수");
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
    }
}
