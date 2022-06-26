package main.java;

import java.time.LocalDate;

public class Year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        LocalDate localDate = LocalDate.of(2016, a, b);
        System.out.println(localDate.getDayOfWeek().toString().substring(0, 3));
    }
}
