package Practice.Algorithms.WarmUp.CompareTheTriplets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static int[] compareTriplets(int a0, int a1, int a2, int b0, int b1, int b2) {
        int aPoints = ((a0 > b0) ? 1 : 0) + ((a1 > b1) ? 1 : 0) + ((a2 > b2) ? 1 : 0);
        int bPoints = ((b0 > a0) ? 1 : 0) + ((b1 > a1) ? 1 : 0) + ((b2 > a2) ? 1 : 0);
        int[] result = {aPoints, bPoints};
        return result;
    }

//        static List<Integer> compareTriplets (List < Integer > a, List < Integer > b){
//        int aWin = 0;
//        int bWin = 0;
//
//        List<Integer> result = new LinkedList<>();
//        for (int i = 0; i < a.size(); i++) {
//            if (a.get( i ) > b.get( i )) {
//                ++aWin;
//            } else if (a.get( i ) < b.get( i )) {
//                ++bWin;
//            }
//        }
//        result.add( aWin );
//        result.add( bWin );
//        return result;
//        }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( System.in );
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = compareTriplets( a0, a1, a2, b0, b1, b2 );
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i] + (i != result.length - 1 ? " " : "") );
        }
        System.out.println( "" );
    }

}
