package main.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ListLectureOne {

    public int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        return IntStream.range(0, arr.length)
            .filter(i -> arr[i] == max)
            .toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
        }
        ListLectureOne listLectureOne = new ListLectureOne();
        listLectureOne.solution(arr);
    }
}
