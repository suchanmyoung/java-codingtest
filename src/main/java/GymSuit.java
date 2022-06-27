package main.java;

import java.util.Arrays;

public class GymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1,2};
        int[] reserve = {2,3};

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                } else if (lost[i] - 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
