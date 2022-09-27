package main.java;

import java.util.LinkedList;
import java.util.List;

public class ListLectureThree {

    static class Solution{

        public static int[] solution(long n) {
            List<Integer> list = new LinkedList<>();

            while(n > 0){
                list.add((int)(n%10));
                n = n/ 10;
            }

            return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        }
    }

    public static void main(String[] args) {
        long n = 12345;
        Solution.solution(n);
    }

}
