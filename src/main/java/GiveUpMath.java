package main.java;

import java.util.ArrayList;
import java.util.List;

public class GiveUpMath {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] answer = {};

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == (first[i%first.length])) firstCount++;
            if(answers[i] == (second[i%second.length])) secondCount++;
            if(answers[i] == (third[i%third.length])) thirdCount++;
            }
        int max = Math.max(Math.max(firstCount, secondCount), thirdCount);

        List<Integer> list = new ArrayList<>();
        if(max==firstCount) list.add(1);
        if(max==secondCount) list.add(2);
        if(max==thirdCount) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
