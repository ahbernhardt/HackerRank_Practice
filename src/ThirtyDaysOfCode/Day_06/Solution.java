package ThirtyDaysOfCode.Day_06;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the number of string");
        int T = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        System.out.println( "Enter string" );
        String[] string = new String[T];
        for (int i = 0; i < T; i++) {
            string[i] = scanner.next();
        }

        for (int temp = 0; temp < T; temp++) {
            for (int j = 0; j < string[temp].length(); j = j + 2) {
                System.out.print( string[temp].charAt( j ) );
            }
            System.out.print( " " );

            for (int j = 1; j < string[temp].length(); j = j + 2) {
                System.out.print( string[temp].charAt( j ) );
            }

            System.out.println();

        }
        scanner.close();
    }
}
