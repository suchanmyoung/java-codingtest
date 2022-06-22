package main.java;

import java.util.Stack;

public class CraneDoll {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int temp = board[j][moves[i]-1];
                if (temp != 0) {
                    if(stack.isEmpty()){
                        stack.push(temp);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                    else{
                        if(temp == stack.peek()){
                            stack.pop();
                            board[j][moves[i]-1] = 0;
                            answer += 2;
                            break;
                        }else{
                            stack.push(temp);
                            board[j][moves[i]-1] = 0;
                            break;
                        }
                    }
                }
            }
        }

//        return answer;
        System.out.println(answer);
    }
}
