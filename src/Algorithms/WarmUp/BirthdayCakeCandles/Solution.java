package Algorithms.WarmUp.BirthdayCakeCandles;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static int birthdayCakeCandles(int[] candles) {
        int max = Integer.MIN_VALUE;
        int numCandles = 0;
        for (int candle : candles) {
            if (candle > max) {
                max = candle;
                numCandles = 1;
            } else if (candle == max) numCandles++;
        }
        return numCandles;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter numbers of candles");
        int n = in.nextInt();
        System.out.println("Enter the each candle's height");
        int[] candles = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            candles[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles( candles );
        System.out.println( "There is " + result +" tallest candles" );
    }
}
