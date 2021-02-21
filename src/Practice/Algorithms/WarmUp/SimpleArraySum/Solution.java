package Practice.Algorithms.WarmUp.SimpleArraySum;

import java.util.Scanner;

public class Solution {

    static int simpleArraySum(int n, int[] ar) {
        Integer sum = 0;
        for (int a : ar) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( String.valueOf( scanner.nextInt() ) );

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split( " " );

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt( arItems[arItr].trim() );
            ar[arItr] = arItem;
        }

        int result = simpleArraySum( n , ar );
        System.out.println( result );
    }
}
