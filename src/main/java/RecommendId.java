package main.java;

public class RecommendId {
//    public static void main(String[] args) {
//        String new_id = "z-+.^.";
//        String firstId = new_id.toLowerCase().replaceAll("[^a-z1-9-_.]", "");
//        if (!firstId.isEmpty()) {
//            String secondId = firstId.replaceAll("\\.\\.+", ".");
//
//            String testId = secondId;
//            if (secondId.charAt(0) == '.') {
//                testId = secondId.substring(1, testId.length());
//            }
//            String thirdId = testId;
//
//            if (testId.charAt(testId.length() - 1) == '.') {
//                thirdId = testId.substring(0, testId.length() - 1);
//            }
//
//            int count = 0;
//            char[] chars = thirdId.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if ((int) chars[i] > 96 && (int) chars[i] < 123) {
//                    count++;
//                }
//            }
//            if (count == 0) {
//                for (int i = 0; i < chars.length; i++) {
//                    chars[i] = 'a';
//                }
//            }
//
//            String fourthId = String.valueOf(chars);
//            String fifthId = fourthId;
//            if (fourthId.length() > 15) {
//                fifthId = fourthId.substring(0, 15);
//            }
//
//            String answer = fifthId;
//
//            if (!fifthId.isEmpty()) {
//                if (fifthId.length() < 3) {
//                    while (answer.length() < 3) {
//                        answer += fifthId.charAt(fifthId.length() - 1);
//                        if(fifthId.charAt(fifthId.length() -1) == '.'){
//                            fifthId = fifthId.substring(0, 14);
//                        }
//                    }
//                }
//            }
//        } else {
//            System.out.println("hello");
//        }
//    }

    public static void main(String[] args) {
        String answer ="..fjdfjdERW229+@(!..!.";
        String temp = answer.toLowerCase().replaceAll("[^-_.a-z0-9]", "");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}", ".");
        System.out.println(temp);
        temp = temp.replaceAll("^[.]|[.]$", "");
        System.out.println(temp);
        System.out.println(temp.length());

        if (temp.equals("")) {
            temp +="a";
        }
        if (temp.length() >= 16) {
            temp = temp.substring(0, 15);
            temp = temp.replaceAll("^[.]|[.]$", "");
        }
        if (temp.length() <= 2) {
            while (temp.length() < 3) {
                temp += temp.charAt(temp.length() - 1);
            }
        }

        answer=temp;
        System.out.println(answer);
    }
}
