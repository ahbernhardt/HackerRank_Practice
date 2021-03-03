package ThirtyDaysOfCode.Day_07;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println( "Enter length of integer in the Array" );
        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );
        int[] arr = new int[n];

        System.out.println( "Enter number in the Array");
        String[] arrItems = scanner.nextLine().split( " " );
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );
        for (int item = 0; item < n; item++) {
            int arrItem = Integer.parseInt( arrItems[item] );
            arr[item] = arrItem;
        }

        System.out.println( "Reverse Array: " );
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print( arr[i] );
            if (i > 0) {
                System.out.print( " " );
            }
        }
        scanner.close();
    }
}
