package main.java;

public class RemainderOne {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        int answer = 0;
        while (count < n) {
            if(n % count == 1){
                answer = count;
                break;
            }
            count++;
        }
        System.out.println(answer);
    }
}
