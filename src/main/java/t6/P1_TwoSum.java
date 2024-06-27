package t6;

import java.util.*;

class P1_TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
    
    Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
    
    Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */


    public static void main (String[] args) {
        int[] result = solution(new int[] { 3,3 }, 6);
        print(result);
    }

    public static void print(int[] result ) {
        for (int i = 0; i < 2; i++) {
            System.out.println(result[i]);
        }
    }
    //solution
    /*
        solution will be seen tricky
        => left = target - element
        => if have left on map -> return left and element
    */
    public static int[] solution(int[] sums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++) {
            int complement = target - sums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(sums[i], i);
        }
        // In case there is no solution, we'll just return null
        return new int[] {-1, -1};
    }

    // two point
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;

        //save number and index to hashMap 
        Map<Integer, Integer> saveData = new HashMap<>();
        for (int i = 0; i < n ; i ++) {
            saveData
                .put(nums[i], i);
        }
        //sort arrays for two point
        Arrays.sort(nums);
        //two point
        while (l <= r) {
            int sum = nums[l] + nums[r];
            if (sum == target)  
                return new int[] { saveData.get(nums[l]), saveData.get(nums[r]) };
            if (sum > target) r--;
            if (sum < target) l--;
        }
        return new int[] { -1,  -1 };
    }

}