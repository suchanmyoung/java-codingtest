package main.java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinearSearchLecturePre {

    static class MyData implements Comparable<MyData>{

        private int v;

        public MyData(int v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return "MyData{" +
                "v=" + v +
                '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            MyData myData = (MyData) o;
            return v == myData.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(v);
        }

        @Override
        public int compareTo(MyData o) {
            return this.v - o.v;
        }
    }


    public static void main(String[] args) {
        List<MyData> list = new LinkedList<>();

        for (int i = 0; i <= 1000000; i++) {
            list.add(new MyData(i));
        }

        //Binary Search - 정렬이 되어 있어야한다
        long start1 = System.nanoTime();
        int i = Collections.binarySearch(list, new MyData(888888));
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);

        //Linear Search
        long start2 = System.nanoTime();
        int index = list.indexOf(new MyData(888888));
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }
}
