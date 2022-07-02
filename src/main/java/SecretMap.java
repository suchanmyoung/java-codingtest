package main.java;


public class SecretMap {
    public static void main(String[] args) {
        int n = 10;
        int[] arr1 = {46, 33, 33 ,22, 31, 50, 10, 14, 14, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10, 14, 10, 50, 14};

        String[] arr1Binary = new String[n];
        String[] arr2Binary = new String[n];

        String temp = "";
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            temp = Integer.toBinaryString(arr1[i]);
            int length = temp.length();
            if (length < n) {
                for (int j = 0; j < n - length; j++) {
                    temp = "0" + temp;
                }
            }
            arr1Binary[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            temp =Integer.toBinaryString(arr2[i]);
            int length = temp.length();
            if (length < n) {
                for (int j = 0; j < n - length; j++) {
                    temp = "0" + temp;
                }
            }
            arr2Binary[i] = temp;
        }

        char[] chars1 = {};
        char[] chars2 = {};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            chars1 = arr1Binary[i].toCharArray();
            chars2 = arr2Binary[i].toCharArray();

            for (int j = 0; j < n; j++) {
                if (chars1[j] == '1' || chars2[j] == '1') {
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        for (String a : answer) {
            System.out.println(a);
        }
    }
}
