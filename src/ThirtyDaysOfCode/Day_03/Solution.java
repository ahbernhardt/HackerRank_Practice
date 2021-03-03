package ThirtyDaysOfCode.Day_03;

import java.util.*;

public class Solution {


    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the integer");
        int N = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        //  N is even AND (in range 2-5 OR greater than 20)
        if ((N % 2 == 0) && ((N >= 2 && N <= 5) || (N > 20))){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
