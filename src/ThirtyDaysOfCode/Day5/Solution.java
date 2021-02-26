package ThirtyDaysOfCode.Day5;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter number multiplication table number");
        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );
        //   Constraints 2 ≤ n ≤ 20
        if((n < 2) || (n > 20)) {
            System.out.println( "Invalid input, between 2-20" );
        } else{
            int result;
            //  loop start with 1 and end with 10
            for (int i = 1; i <= 10 ; i++){
                result = (n*i);
                System.out.println(n + " x " + i + " = "+ result );
            }
        }
        scanner.close();
    }
}
