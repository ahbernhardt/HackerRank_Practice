package Practice.Algorithms.WarmUp.SolveMeFirst;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        int sum = 0;
        if ((1 > a) || (a > 1000) || (1 > b) || (b > 1000)) {
            System.out.println("In Put need in range 1 to 1000");
            return sum;
        }
        sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst( a, b );
        System.out.println( sum );
    }
}

