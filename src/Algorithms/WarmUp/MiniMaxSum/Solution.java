package Algorithms.WarmUp.MiniMaxSum;

import java.util.Scanner;

public class Solution {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = 0, max = 0, total = 0;
        min = arr[0];
        max = min;
        total = min;
        //  number in enhanced for loop of the arr
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
            if (arr[i] < min) { //  compare current number with the min in the arr
                min = arr[i];
            }
            if (arr[i] > max) { //  compare current number with the max in the arr
                max = arr[i];
            }
        }
        System.out.print( (total - max) + " " + (total - min) );
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt( arrItems[i] );
            arr[i] = arrItem;
        }

        miniMaxSum( arr );

        scanner.close();
    }
}
