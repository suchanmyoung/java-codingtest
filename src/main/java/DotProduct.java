package main.java;

public class DotProduct {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int answer = 0;

        int length = a.length;
        for (int i = 0; i < length; i++) {
            int temp = a[i] * b[i];
            answer += temp;
        }

        System.out.println(answer);
    }
}
