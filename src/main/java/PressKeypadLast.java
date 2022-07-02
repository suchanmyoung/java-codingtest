package main.java;

public class PressKeypadLast {
    public static void main(String[] args) {
        String a = "LRLLLRLLRRL";
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        StringBuilder sb = new StringBuilder();
        int leftHand = 0;
        int rightHand = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0){
                numbers[i] = 11;
            }

            if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                rightHand = numbers[i];
            }

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                leftHand = numbers[i];
            }

            if (numbers[i] == 0 || numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8) {
                String press = pressMiddleKey(numbers[i], hand, leftHand, rightHand);
                if(press.equals("L")){
                    leftHand = numbers[i];
                } else if (press.equals("R")) {
                    rightHand = numbers[i];
                }
                sb.append(press);
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
    }

    public static String pressMiddleKey(int middleKey, String hand, int leftHand, int rightHand){
        int x = middleKey / 3;
        int y = middleKey % 3;

        int rightHandDistance = (middleKey > rightHand) ? middleKey - rightHand : rightHand - middleKey;
        int leftHandDistance = (middleKey > leftHand) ? middleKey - leftHand : leftHand - rightHand;

        if(rightHandDistance > leftHandDistance){
            return "R";
        }

        if (leftHandDistance > rightHandDistance) {
            return "L";
        }

        if(rightHandDistance == leftHandDistance){
            if (hand.equals("right")) {
                return "R";
            }else if(hand.equals("left")){
                return "L";
            }
        }

        return null;
    }
}
