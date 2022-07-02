package main.java;

import java.util.ArrayList;

public class DartGame {
    public static void main(String[] args) {
        int answer = 0;
        String dartResult = "1D2S0T";


        char[] chars = dartResult.toCharArray();

        int listIndex = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'S'){
                if(i == 1 && chars[i-1] == '0'){
                    list.add(0);
                    listIndex++;
                }else if(chars[i-1] == '0'){
                    if(chars[i-2] == '1') {
                        list.add(10);
                        listIndex++;
                    }else{
                        list.add(0);
                        listIndex++;
                    }
                }else {
                    list.add(Character.getNumericValue(chars[i-1]));
                    listIndex++;
                }
            }
            if (chars[i] == 'D') {
                if(i == 0 && chars[i-1] == '0'){
                    list.add(0);
                    listIndex++;
                }else if(chars[i-1] == '0'){
                    if(chars[i-2] == '1') {
                        list.add((int) Math.pow(10, 2));
                        listIndex++;
                    }else{
                        list.add(0);
                        listIndex++;
                    }
                }else {
                    list.add((int) Math.pow((Character.getNumericValue(chars[i-1])), 2));
                    listIndex++;
                }
            }
            if (chars[i] == 'T') {
                if(i == 0 && chars[i-1] == '0'){
                    list.add(0);
                    listIndex++;
                }else if(chars[i-1] == '0'){
                    if(chars[i-2] == '1'){
                        System.out.println("여게들와야지");
                        list.add((int) Math.pow(10, 3));
                        listIndex++;
                    }else{
                        list.add(0);
                        listIndex++;
                    }
                }else {
                    list.add((int) Math.pow((Character.getNumericValue(chars[i-1])), 3));
                    listIndex++;
                }
            }
            if (chars[i] == '*'){
                if (listIndex == 0) {
                    list.set(listIndex, list.get(listIndex) * 2);
                }else {
                    list.set(listIndex, list.get(listIndex) * 2);
                    list.set(listIndex - 1, list.get(listIndex-1) * 2);
                }
            }
            if(chars[i] == '#'){
                list.set(listIndex, list.get(listIndex) * -1);
            }

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            answer += list.get(i);
        }

        System.out.println(answer);
    }
}
