package com.company;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            numToIndex.put(num, i);
        }

        // In case no solution is found, throw an exception or return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        _1_Two_Sum solution = new _1_Two_Sum();
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
