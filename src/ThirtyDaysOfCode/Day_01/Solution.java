package ThirtyDaysOfCode.Day_01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Declare first integer, double, and String variables. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner( System.in );
        /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = scan.next() + scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int sumInt = i + i2;
        double sumDouble = d + d2;
        String conString = s.concat( s2 );

        /* Print the sum of both integer variables on a new line. */
        System.out.println( sumInt );
        /* Print the sum of the double variables on a new line. */
        System.out.printf( "%.1f \n", sumDouble );
        /* Concatenate and print the String variables on a new line; the 's' variable above should be printed first. */
        System.out.println( conString );

        scan.close();
    }
}
