package main.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 현수는 1년 과정의 수업계획을 짜야함
 * 필수과목은 반드시 수강해야 하고 순서도 정해져있음
 *
 * 총 과목이 A, B, C, D, E, F, G가 있고, 필수과목이 CBA로 주어지면
 * 필수 과목은 C, B, A며 이 순서대로 수업계획을 짜야함
 *
 * 여기서 순서란 B과목은 C과목을 이수한 다음 들어야 하고, A 과목은 C,B를 이수해야함
 * 잘된것이면 YES, 잘못된 것이면 No
 *
 * 첫 줄에 한 줄에 필수과목 순서,
 * 두 번째 줄 현수가 짠 수업 설계
 */

public class StudyPlan {
    public String solution(String need, String plan){
        String answer ="YES";
        Queue<Character> queue = new LinkedList<>();
        
        for (char x : need.toCharArray()) queue.offer(x);
        for (char x : plan.toCharArray()){
            if(queue.contains(x)){
                if(x!=queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        StudyPlan T = new StudyPlan();
        Scanner kb = new Scanner(System.in);
        String need= kb.next();
        String plan = kb.next();

        System.out.println(T.solution(need, plan));
    }
}
