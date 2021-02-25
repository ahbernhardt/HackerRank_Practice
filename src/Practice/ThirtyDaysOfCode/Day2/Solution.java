package Practice.ThirtyDaysOfCode.Day2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = ((meal_cost / 100) * tip_percent);
        double tax = ((meal_cost / 100) * tax_percent);
        double total_cost = meal_cost + tip + tax;
        System.out.println( "Meal Cost " + meal_cost );
        System.out.println( "Tax " + tax );
        System.out.println( "Tip " + tip );
        System.out.println( "Total " + Math.round( total_cost ) );
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println( "Enter meal cost" );
        double meal_cost = scanner.nextDouble();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        System.out.println( "Enter tip percent" );
        int tip_percent = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        System.out.println("Enter tax percent");
        int tax_percent = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        solve( meal_cost, tip_percent, tax_percent );

        scanner.close();
    }
}
