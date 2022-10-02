package main.java;

import java.util.LinkedList;
import java.util.List;

public class SqLectureFour {

    //내 문서인지와 우선순위라는 정보 두 가지가 함께 움직여야 하기 때문에 클래스를 만듬
    static class Paper {
        boolean isMine;
        int priority;

        Paper(int p, boolean isMine) {
            this.priority = p;
            this.isMine = isMine;
        }
    }

    static class Solution{
        public int solution(int[] priorities, int location) {
            int answer = 0;
            List<Paper> queue = new LinkedList<>();

            //리스트에 페이퍼 객체를 순서대로 삽입
            for (int i = 0; i< priorities.length; i++) {
                queue.add(new Paper(priorities[i], i == location));
            }


            while (!queue.isEmpty()){
                //첫번째를 꺼내서
                Paper now = queue.remove(0);
                boolean printable = true;

                //이후에 더 큰게있는지 체크
                for (Paper p : queue) {
                    if (now.priority < p.priority) {
                        printable = false;
                        break;
                    }
                }

                //이후에 더 큰게 있으면 다시 맨 뒤로 집어넣음
                if (!printable) {
                    queue.add(now);
                    continue;
                }

                answer++;
                if (now.isMine) {
                    return answer;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution.solution(priorities, location));
    }

}
