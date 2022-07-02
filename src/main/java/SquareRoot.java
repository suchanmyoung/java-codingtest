package main.java;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 1;
        long answer = 0;
        for (int i = 0; i <= n; i++) {

            if (Math.pow(i, 2) == n) {
                answer = (long)Math.pow(i + 1, 2);
                break;
            }

            if (Math.pow(i, 2) > n) {
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}
