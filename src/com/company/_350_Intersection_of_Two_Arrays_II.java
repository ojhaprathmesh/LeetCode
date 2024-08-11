package com.company;

import java.util.Arrays;

class _350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Prepare an array to store the intersection elements
        int[] tempResult = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        // Pointers for both arrays
        int i = 0, j = 0;

        // Iterate over both arrays to find intersections
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // If elements match, add to result array
                tempResult[index++] = nums1[i];
                i++;
                j++;
            }
        }

        // Resize the array to fit the actual number of intersection elements
        return Arrays.copyOf(tempResult, index);
    }
}