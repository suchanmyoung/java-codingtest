package main.java;

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        int leftIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                answer[leftIdx] = arr[i];
                leftIdx++;
            }if(arr.length == 1){
                answer[leftIdx] = -1;
            }
        }
    }
}
