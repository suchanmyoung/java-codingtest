package main.java;

import java.util.ArrayList;

public class MockExam {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (arr1[i%arr1.length] == answers[i]) correct1++;
            if (arr2[i%arr2.length] == answers[i]) correct2++;
            if (arr3[i%arr3.length] == answers[i]) correct2++;
        }

        int max = Math.max(Math.max(correct1, correct2), correct3);

        ArrayList<Integer> list = new ArrayList<>();

        if(max == correct1) list.add(1);
        if(max == correct2) list.add(2);
        if(max == correct3) list.add(3);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(answer[i]);
        }

    }
}
