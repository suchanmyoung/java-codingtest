package main.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortLectureOne {
    static class MyData implements Comparable<MyData>{
        int v;

        public MyData(int v){
            this.v = v;
        }


        @Override
        public int compareTo(MyData o) {
            return Integer.compare(v, o.v);
        }

        @Override
        public String toString() {
            return String.valueOf(v);
        }
    }

    public static void main(String[] args) {
        List<MyData> list = new LinkedList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(new MyData(r.nextInt(50)));
        }

        list = quickSort(list);

        System.out.println(list);
    }

    private static List<MyData> quickSort(List<MyData> list) {
        if (list.size() <= 1) {
            return list;
        }

        MyData pivot = list.remove(0);

        List<MyData> less = new LinkedList<>();
        List<MyData> greater = new LinkedList<>();

        for (MyData m : list) {
            if (pivot.compareTo(m) < 0) {
                less.add(m);
            } else {
                greater.add(m);
            }
        }

        List<MyData> merged = new LinkedList<>();
        merged.addAll(quickSort(less));
        merged.add(pivot);
        merged.addAll(quickSort(greater));

        return merged;
    }
}
