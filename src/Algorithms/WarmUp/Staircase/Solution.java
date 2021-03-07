package Algorithms.WarmUp.Staircase;

import java.util.Scanner;

public class Solution {
    static String getNStrings(int n, String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append( s );
        }
        return result.toString();
    }

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print( getNStrings( n - i, " " ) );
            System.out.print( getNStrings( i, "#" ) );
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter integer number");
        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );
        staircase( n );
    }
}
