package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BiggestNumber {

    public String solution(int[] numbers) {
        String answer = "";
        String arr[] = new String[numbers.length];

        for (int i = 0; i<numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        return answer;
    }

    public static void main(String[] args) {
        BiggestNumber biggestNumber = new BiggestNumber();

        int arr[] = {3, 30, 34, 5, 9};
        System.out.println(biggestNumber.solution(arr));
    }
}
