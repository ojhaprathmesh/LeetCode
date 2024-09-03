package com.company;

import java.util.Arrays;

public class _4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float median;
        int[] memory = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (i < nums1.length) {
                memory[i] = nums1[i];
            } else {
                memory[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(memory);

        if (memory.length % 2 == 0) {
            median = (float) (memory[Math.round((float) memory.length / 2)] + memory[Math.round((float) memory.length / 2) - 1]) / 2;
        } else {
            median = (float) (memory[Math.round((float) memory.length) / 2]);
            System.out.println(median);
        }
        return median;
    }

    public static void main(String[] args) {
        _4_Median_of_Two_Sorted_Arrays obj = new _4_Median_of_Two_Sorted_Arrays();
        System.out.println(obj.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
