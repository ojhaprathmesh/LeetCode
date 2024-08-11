package com.company;

class _1550_Three_Consecutive_Odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}