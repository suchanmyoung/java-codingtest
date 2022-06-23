package main.java;

public class XIntervalN {
    public static void main(String[] args) {
        long x = -4;
        int n = 2;

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
    }
}
