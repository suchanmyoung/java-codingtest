package main.java;

public class Lotto {

    public static void main(String[] args) {
        int[] arr1 = {44, 1, 0, 0, 31, 25};
        int[] arr2 = {31, 10, 45, 1, 6, 19};
        int best = 7;
        int worst = 7;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 0){
                best--;
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    worst--;
                    best--;
                }
            }
        }



        int[] answer = {best, worst};
    }
}
