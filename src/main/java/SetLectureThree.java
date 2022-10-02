package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SetLectureThree {

    static class Solution {

        public int[] solution(int[] arr) {
            List<Integer> list = new ArrayList<>();

            Queue queue = new LinkedList();

            for (int a : arr) {
                queue.offer(a);
            }

            Iterator iterator = queue.iterator();

            int temp = -1;
            while (iterator.hasNext()) {
                int next = (int) iterator.next();
                if (next != temp) {
                    temp = next;
                    list.add(next);
                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

            return list.stream().mapToInt(Integer::intValue)
                .toArray();
            }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        solution.solution(arr);
    }

}
