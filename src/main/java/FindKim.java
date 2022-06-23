package main.java;

public class FindKim {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        int index=0;

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                index=i;
                break;
            }
        }

        String answer = "김서방은 " + index + "에 있다";
    }
}
