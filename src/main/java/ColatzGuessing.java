package main.java;

public class ColatzGuessing {
    public static void main(String[] args) {
        int num = 626331;
        int answer = 0;


        while(num != 1) {
            num = num % 2 == 0 ? num / 2 : (num * 3) + 1;
            answer++;
        }
        System.out.println(answer);
    }
}
