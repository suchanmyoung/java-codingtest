package main.java;

public class SkillCheck {
    public static void main(String[] args) {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};

        int length = arr1.length;
        int[][] answer = new int[arr1.length][arr1[1].length];;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

    }
}
