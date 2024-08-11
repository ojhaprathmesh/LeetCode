package com.company;

public class _2134_Minimum_Swaps_to_Group_All_1s_Together_II {
    public int check(int[] nums, int start, int end, int count, int totalOnes) {
        if (start == nums.length) {
            return count;
        }

        int zeroCount = 0;
        for (int i = start; i <= end; i++) {
            if (nums[i % nums.length] == 0) {
                zeroCount++;
            }
        }

        int minSwaps = Math.min(count, zeroCount);

        return check(nums, start + 1, end + 1, minSwaps, totalOnes);
    }

    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        if (totalOnes == 0 || totalOnes == nums.length) {
            return 0;
        }

        return check(nums, 0, totalOnes - 1, Integer.MAX_VALUE, totalOnes);
    }
}