package Algorithms.WarmUp.AVeryBigSum;

import java.util.Scanner;

public class Solution {
    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Integer number:");
        int n = scanner.nextInt();

        System.out.println("Enter array of long number:");
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = scanner.nextLong();
        }
        long result = aVeryBigSum( n, ar );
        System.out.println("Sum is: " + result );
    }
}
