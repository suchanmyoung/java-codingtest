package main.java;

public class AddPlusMinus {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int answer = 0;

        int length = absolutes.length;

        for (int i = 0; i < length; i++) {

            if (signs[i] == false) {
                absolutes[i] = absolutes[i] - absolutes[i] - absolutes[i];
            }
            answer += absolutes[i];
        }
        System.out.println(answer);
    }
}
