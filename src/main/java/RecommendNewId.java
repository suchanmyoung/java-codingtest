package main.java;

public class RecommendNewId {
    public static void main(String[] args) {
        String new_id =  "123_.def";
        String answer="";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");

        if (answer.charAt(0) == '.') {
            answer = answer.replaceAll("^.", "");
        }

        if (answer.isEmpty()){
            answer = "a";
        }

        if (answer.charAt(answer.length()-1) == '.') {
            answer = answer.replaceAll(".$", "");
        }



        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }

        if (answer.charAt(answer.length()-1) == '.') {
            answer = answer.replaceAll(".$", "");
        }

        if (answer.length() < 3) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        System.out.println(answer);
    }
}
