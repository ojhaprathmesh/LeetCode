package com.company;

import java.util.ArrayList;
import java.util.List;

public class _624_Maximum_Distance_in_Arrays {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize the min and max with the values from the first array
        int min = arrays.getFirst().getFirst();
        int max = arrays.getFirst().getLast();
        int maxDistance = 0;

        // Iterate through each array starting from the second one
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int currentMin = array.getFirst();
            int currentMax = array.getLast();

            // Calculate the distance with the global min and max
            maxDistance = Math.max(maxDistance, Math.max(Math.abs(max - currentMin), Math.abs(currentMax - min)));

            // Update the global min and max values
            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);
        }

        return maxDistance;
    }

    public static void main(String[] args) {
        _624_Maximum_Distance_in_Arrays obj = new _624_Maximum_Distance_in_Arrays();

        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(List.of(1, 2, 3));
        arrays.add(List.of(4, 5));
        arrays.add(List.of(1, 2, 3));

        int result = obj.maxDistance(arrays);
        System.out.println(result);
    }
}
