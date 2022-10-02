package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class SqLectureTwo {
    static class Solution{

        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> queue = new LinkedList<>();

            //진행도 날짜 구하기
            for (int i = 0; i < progresses.length; i++) {
                float p = progresses[i];
                float s = speeds[i];
                int days = (int) Math.ceil((100 - p) / s);
                queue.offer(days);
            }

            //이전 값이 크면 count를 더하고 continue, 작으면 정답 큐에 카운트 offer 하면서 초기화
            Queue<Integer> answer = new LinkedList<>();
            int d = queue.poll();
            int count = 1;
            while (!queue.isEmpty()) {
                int n = queue.poll();
                if (d >= n) {
                    count++;
                    continue;
                }

                answer.offer(count);
                count = 1;
                d = n;
            }

            answer.offer(count);

            return answer.stream().mapToInt(Integer::intValue)
                .toArray();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(solution.solution(progresses, speeds));
    }
}
