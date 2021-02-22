package Practice.Algorithms.WarmUp.DiagonalDifference;


import java.util.Scanner;

public class Solution {
    static int diagonalDifference(int[][] a) {
        int diagonalSumLTR = 0;
        int diagonalSumRTL = 0;
        for (int i = 0; i < a.length; i++) {
            diagonalSumLTR += a[i][i];
            diagonalSumRTL += a[i][(a.length - 1) - i];
        }
        return Math.abs( diagonalSumLTR - diagonalSumRTL );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the number of array");
        int n = in.nextInt();
        System.out.println("Enter the number in each array");
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference( a );
        System.out.println("Difference of 2 diagonal is: " + result );
        in.close();
    }
}

//class Result {

//    public static int diagonalDifference(List<List<Integer>> arr) {
//        int forward = 0;
//        int backward = 0;
//        int n = arr.size();
//        for (int i = 0; i < n; i++) {
//            forward += arr.get( i ).get( i );
//            backward += arr.get( i ).get( n - i - 1 );
//        }
//        int absd = Math.abs( forward - backward );
//        return absd;
//    }
//}
