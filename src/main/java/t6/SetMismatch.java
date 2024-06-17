package t6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public static void main(String[] args) {
//        System.out.println(findErrorNums(new int[] { 1,2,2,4 }));
        System.out.println(findErrorNums(new int[] { 2,2 }));
    }
    /*
    You have a set of integers s, which originally contains all the numbers from 1 to n.
    Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

    You are given an integer array nums representing the data status of this set after the error.

    Find the number that occurs twice and the number that is missing and return them in the form of an array.
    Example 1:

    Input: nums = [1,2,2,4]
    Output: [2,3]
    Example 2:

    Input: nums = [1,1]
    Output: [1,2]
    */
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[] {-1, -1};

        Map<Integer, Integer > hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                Integer v = hashMap.get(num);
                hashMap.put(num, v + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (hashMap.containsKey(i)) {
                if (hashMap.get(i) >= 2) {
                    result[0] = i;
                }
            } else {
                result[1] = i;
            }
        }
        return result;
    }


    public static int[] findErrorNums_2(int[] nums) {
        return null;
    }
}
