package main.java;

import java.util.Stack;

public class SqLectureOne {
    static class Solution{
        boolean solution(String s) {
            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (char a : chars) {
                if (a == '(') {
                    stack.push(a);
                }
                if(a == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()()";
        System.out.println(solution.solution(s));
    }
}
