package Practice.DataStructures.Arrays.TwoD_ArraysDS;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    static int hourglassSum(int[][] arr, int row, int col) {
        return arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
                        arr[row + 1][col + 1]
        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Array size");
        int[][] arr = new int[6][6];

        System.out.println("Enter Array's number");
        for (int arr_row = 0; arr_row < 6; arr_row++) {
            for (int arr_col = 0; arr_col < 6; arr_col++) {
                arr[arr_row][arr_col] = scanner.nextInt();
            }
        }

        int largestSum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - 2; row++) {
            // For each row iterate over all the top left numbers of an hourglass
            for (int col = 0; col < arr[0].length - 2; col++) {
                int sum = hourglassSum( arr, row, col );
            // largestSum = (sum > largestSum) ? sum : largestSum;
                largestSum = Math.max( sum, largestSum );
            }
        }

        System.out.print("Largest Hourglass Sum: "+ largestSum );
        scanner.close();
    }
}

