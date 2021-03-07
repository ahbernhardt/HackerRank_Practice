package Algorithms.WarmUp.PlusMinus;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    static void plusMinus(int[] arr) {
        DecimalFormat numberFormat = new DecimalFormat( "#.000000" );
        int count = arr.length;
        long positives = IntStream.of( arr ).filter( i -> i > 0 ).count();
        long negatives = IntStream.of( arr ).filter( i -> i < 0 ).count();
        long zeros = IntStream.of( arr ).filter( i -> i == 0 ).count();
        System.out.println( (double) positives / count );
        System.out.println( (double) negatives / count );
        System.out.println( (double) zeros / count );
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split( " " );

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt( arrItems[i] );
            arr[i] = arrItem;
        }
        plusMinus( arr );
    }
}
