package com.company;

public class _2022_Convert_1D_Array_Into_2D_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        _2022_Convert_1D_Array_Into_2D_Array converter = new _2022_Convert_1D_Array_Into_2D_Array();
        int[] original = {0, 1, 2, 3};
        int m = 2;
        int n = 2;
        int[][] result = converter.construct2DArray(original, m, n);

        // Print the result
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
