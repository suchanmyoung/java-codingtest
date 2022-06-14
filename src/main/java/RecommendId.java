package main.java;

public class RecommendId {
    public static void main(String[] args) {
        String new_id = "z-+.^.";
        String firstId = new_id.toLowerCase().replaceAll("[^a-z1-9-_.]", "");
        if (!firstId.isEmpty()) {
            String secondId = firstId.replaceAll("\\.\\.+", ".");

            String testId = secondId;
            if (secondId.charAt(0) == '.') {
                testId = secondId.substring(1, testId.length());
            }
            String thirdId = testId;

            if (testId.charAt(testId.length() - 1) == '.') {
                thirdId = testId.substring(0, testId.length() - 1);
            }

            int count = 0;
            char[] chars = thirdId.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ((int) chars[i] > 96 && (int) chars[i] < 123) {
                    count++;
                }
            }
            if (count == 0) {
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = 'a';
                }
            }

            String fourthId = String.valueOf(chars);
            String fifthId = fourthId;
            if (fourthId.length() > 15) {
                fifthId = fourthId.substring(0, 15);
            }

            String answer = fifthId;

            if (!fifthId.isEmpty()) {
                if (fifthId.length() < 3) {
                    while (answer.length() < 3) {
                        answer += fifthId.charAt(fifthId.length() - 1);
                        if(fifthId.charAt(fifthId.length() -1) == '.'){
                            fifthId = fifthId.substring(0, 14);
                        }
                    }
                }
            }
        } else {
            System.out.println("hello");
        }
    }
}
