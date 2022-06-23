package main.java;

public class MakeStar {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            if(i != b-1) System.out.println();
        }
    }
}
