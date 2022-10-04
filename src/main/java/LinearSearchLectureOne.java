package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LinearSearchLectureOne {
    static class Solution{

        public boolean solution(String[] phone_book) {

            Arrays.sort(phone_book);

            //정렬 후 비교할 수도 있음
            for (int i = 1; i < phone_book.length-1; i++) {
                if (phone_book[i].startsWith(phone_book[i - 1])) {
                    return false;
                }
            }

//            Map<String, Integer> map = new HashMap<>();
//
//            for (int i = 0; i < phone_book.length; i++) {
//                map.put(phone_book[i], i);
//            }
//
//            //맵을 먼저 loop
//            for (int i = 0; i < phone_book.length; i++) {
//                //맵 루프 안에 String 길이보다 1작게 루프를 돔(자기는 해당 안되게)
//                for (int j = 0; j < phone_book[i].length(); j++) {
//                    System.out.println(phone_book[i].substring(0, j));
//                    //자기보다 작은 길이 중에 맞는 게 있으면 굿
//                    if (map.containsKey(phone_book[i].substring(0, j))) {
//                        return false;
//                    }
//                }
//            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution.solution(phone_book));
    }
}
