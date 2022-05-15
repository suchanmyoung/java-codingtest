package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
 */
public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] answer={};

        //double loop
        //시간 복잡도 O(n2)
        //공간 복잡도 O(1)
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }


        //Map 자료구조로 풀기
        //시간 복잡도 O(n)
        //공간 복잡도 O(n)
        //target - nums[i]을 키로 저장, index로 i를 저장
        //map.containsKey(nums[i])를 만족하면, 해당 key의 value는 첫 번째 값의 인덱스
        //i는 나머지 값의 인덱스
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return answer;
    }


    public static void main(String[] args) {
        TwoSum T = new TwoSum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(arr, m)) {
            System.out.print(x + " ");
        }
    }
}
