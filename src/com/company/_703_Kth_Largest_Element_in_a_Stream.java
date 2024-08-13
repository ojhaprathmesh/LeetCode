package com.company;

import java.util.PriorityQueue;

public class _703_Kth_Largest_Element_in_a_Stream {
    private final int k;
    private final PriorityQueue<Integer> minHeap;

    public _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}


//import java.util.PriorityQueue;
//
//public class KthLargest {
//    private final int k;
//    private final PriorityQueue<Integer> minHeap;
//
//    public KthLargest(int k, int[] nums) {
//        this.k = k;
//        this.minHeap = new PriorityQueue<>(k); // Min-heap to store the top k elements
//
//        // Initialize the heap with the elements from the array
//        for (int num : nums) {
//            add(num);
//        }
//    }
//
//    public int add(int val) {
//        // If the heap has fewer than k elements, add the new value
//        if (minHeap.size() < k) {
//            minHeap.offer(val);
//        } else if (val > minHeap.peek()) {
//            // If the new value is larger than the smallest in the heap, replace it
//            minHeap.poll();
//            minHeap.offer(val);
//        }
//        // The k-th largest element is the root of the min-heap
//        return minHeap.peek();
//    }
//}