package main.java;

public class ScarceNumber {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer = answer + (long)i*price;
        }

        if(answer <= money){
            answer = 0;
        }

        if(answer > money){
            answer = answer - money;
        }

        System.out.println(answer);
    }
}
