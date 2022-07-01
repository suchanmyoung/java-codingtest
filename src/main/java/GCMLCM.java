package main.java;

public class GCMLCM {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int gcd = GCD(n, m);
        int lcm = gcd * (n / gcd) * (m / gcd);

        int[] answer = {gcd, lcm};
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }
}
