package main.java;

public class SumBetweenInteger {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int reverse = 0;
        long answer = 0;

        if(a>b){
            reverse = a;
            a = b;
            b = reverse;
        }else if(a==b){
            answer =  a;
        }else{
            for (long i = a; i <= b; i++) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
