package main.java;

public class Ternary {
    public static void main(String[] args) {
        long n = 125;
        int answer = 0;
        int count = 0;
        StringBuilder builder = new StringBuilder();
        while (n>0){
            builder.append(String.valueOf(n%3));
            n = n / 3;
        }
        char[] ternary = builder.toString().toCharArray();
        for (int i = ternary.length-1; i >= 0; i--) {
            answer += Character.getNumericValue(ternary[i]) * (int) Math.pow(3, count);
            count++;
        }

        System.out.println(answer);
    }
}
