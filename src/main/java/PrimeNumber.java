package main.java;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int answer=0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrimeNumber(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
    }

    static boolean isPrimeNumber(int sum){
        int i=2;
        int count = 0;
        while(i<sum){
            if(sum%i==0) {
                count++;
                break;
            }
            i++;
        }
        if(count == 0) return true;
        return false;
    }
}
