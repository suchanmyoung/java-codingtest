package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class HarshadNumber {
    public static void main(String[] args) {
//        int x = 11;
//        boolean answer = false;
//        int sum = 0;
//        int temp = x;
//        ArrayList<Integer> list = new ArrayList();
//
//        while (temp > 0) {
//            list.add(temp % 10);
//            temp = temp / 10;
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//
//        if(x % sum == 0) answer = true;
        int num = 12345;
        String strNum = Integer.toString(num);
        int[] arrNum = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) -0;
            System.out.println(arrNum[i]);
        }
        System.out.print(Arrays.toString(arrNum));
    }
}
