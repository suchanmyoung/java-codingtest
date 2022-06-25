package main.java;

import java.util.*;

public class SortByMyself {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                if (o1.charAt(n) < o2.charAt(n)) return -1;
                else return 0;
            }
        });

        for (String string : strings) {
            System.out.println(string);
        };
    }
}
