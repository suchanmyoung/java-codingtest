package main.java;

public class AddMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbersOneToNine = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = 0;


        for (int i : numbersOneToNine) {
            int count=0;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                   count++;
                   break;
                }
            }
            if(count == 0) answer+=i;
        }
    }
}
