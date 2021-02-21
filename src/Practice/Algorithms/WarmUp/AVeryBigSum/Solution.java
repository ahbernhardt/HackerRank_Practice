package Practice.Algorithms.WarmUp.AVeryBigSum;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int arCount = scanner.nextInt();

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split( " " );

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong( arItems[i] );
            ar[i] = arItem;
        }
        long result = aVeryBigSum( ar );
        System.out.println(result);
    }
}
