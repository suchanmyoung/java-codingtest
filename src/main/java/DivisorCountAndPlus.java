package main.java;

public class DivisorCountAndPlus {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum = sum + divisor(i);
        }

        System.out.println(sum);
    }
    public static int divisor(int integer){
        int count = 0;
        for (int i = 1; i <= integer; i++) {
            if(integer % i==0){
                count++;
            }
        }
        if(count % 2 != 0){
            return -integer;
        }
        return integer;
    }
}
