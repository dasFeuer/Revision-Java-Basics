package basics;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int target = 7;

        int[] searched = search(matrix, target);
        int max = maxDigit(matrix);
        System.out.println(Arrays.toString(searched)); // [1, 2]
        System.out.println(max);
    }
    static int[] search(int[][] ints, int target){
        for (int row = 0; row < ints.length; row++) {
            for (int col = 0; col < ints[row].length; col++) {
//                int element = ints[row][col];
                if (ints[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int maxDigit(int[][] ints){
        int max = ints[0][0];
        for (int row = 0; row < ints.length; row++) {
            for (int col = 0; col < ints[row].length; col++) {
                if (max < ints[row][col]){
                    max = ints[row][col];
                }
            }
        }
        return max;
    }
}
