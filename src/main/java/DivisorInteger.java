package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorInteger {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                arrayList.add(arr[i]);
            }
        }

        Collections.sort(arrayList);

        if(arrayList.size() == 0) arrayList.add(-1);

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
    }
}
