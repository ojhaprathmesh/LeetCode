package com.company;

import java.util.Arrays;

public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        nums = Arrays.stream(nums).sorted().toArray();
        int least = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                least = i + 1;
            }
        }

        int[] sol = new int[least];
        int count = 0;
        for (int i = 0; i < least; i++) {

        }
        return sol;
    }

    public static void main(String[] args) {
        _1_Two_Sum obj = new _1_Two_Sum();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
