package main.java;

public class Joystick {
    public int solution(String name){
        int answer = 0;
        int LR = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 65, 26 - (c - 65));

            int indexA = i+1;
            while (indexA < name.length() && name.charAt(indexA) == 'A') {
                indexA++;
            }

            LR = Math.min(LR, i + i + name.length() - indexA);
        }
        return answer + LR;
    }


    public static void main(String[] args) {
        Joystick joystick = new Joystick();

        System.out.println(joystick.solution("JAZ"));
    }

}
