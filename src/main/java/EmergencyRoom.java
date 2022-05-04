package main.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 도착한 순서대로 진료하는 응급실.
 * 위험도가 높은 환자는 빨리 해야함.
 *
 * 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자 꺼냄.
 * 나머지 대기 목록에서 환자보다 위험보다 높은 환자가 존재하면 대기 목록
 * 제일 뒤로 보냄.
 * 즉, 대기목록에 자기보다 위험도가 높은 환자가 없을 때 자신이 진료
 *
 * N명의 환자가 대기목록.
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는
 * 몇 번째로 진료 받는지.
 */
public class EmergencyRoom {

    public int solution(int n, int m, int[] arr) {
        int answer=0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if (x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if(tmp.id==m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        EmergencyRoom T = new EmergencyRoom();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr));
    }

    class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id=id;
            this.priority=priority;
        }
    }
}
