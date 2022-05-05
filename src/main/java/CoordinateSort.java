package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬
 * N개의 평면상의 좌표(x,y)가 주어지면 모든 좌표를 오름차순으로 정렬
 * <p>
 * 정렬기준은 먼저 x값으로 정렬하고, x값이 같을 경우 y으로 정렬
 */

class Point implements Comparable<Point> {
    public int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * A.compareTo(B)
     * */

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}
public class CoordinateSort {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        //뭔가 내부적으로 arr이 들어가서 어떤 sort 알고리즘을 돌리는데,
        //0-1비교할 때 compareTo(내가 재정의한 방식)으로 비교하고
        //this.x - o.x 했을 때 음수가 나오면(return이 음수면)
        //앞의 값을 맨 앞에 두는 방식으로 sort?(앞 값을 앞으로 배치)
        for(Point o : arr) System.out.println(o.x + " " + o.y);
        System.out.println();
    }
}
