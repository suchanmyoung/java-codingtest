package main.java;

import java.util.Scanner;

/**
 * 현수가 영희에게 알파벳 대문자로 구성된 비밀편지를 컴퓨터를 이용해 보냄
 * 비밀편지는 서로 약속한 암호로 구성
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개 구성
 * 현수가 #*****# 으로 문자를 보내면,
 * #*****#을 일곱자리의 이진수 #은 1, *은 0으로 변환
 * 바뀐 2진수를 10진수로 바꿈.
 * 아스키 번호가 65문자로 변환. A
 *
 * #****## #**#### #**#### #**##** -> COOL
 *
 * 첫 줄에는 보낸 문자의 개수가 입력됨.
 * 다음 줄에는 문자의 개수의 일곱 배 만큼 # 또는 * 신호가 입력
 */
public class EncryptLetter {
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) { // replace 함수..!!!!!
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); // 0 ~ 7전까지 substring
            int num = Integer.parseInt(tmp, 2); //2진수를 10진수로 바꿔버림
            answer+=(char)num;
            s=s.substring(7); // 7부터 마지막까지 substring
        }

        return answer;
    }

    public static void main(String[] args) {
        EncryptLetter T = new EncryptLetter();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(k, str));
    }

}
