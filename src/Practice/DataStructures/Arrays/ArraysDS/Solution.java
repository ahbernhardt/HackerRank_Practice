package Practice.DataStructures.Arrays.ArraysDS;
import java.io.*;
import java.util.*;


public class Solution {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws IOException {
        System.out.println("Enter length of the Array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers in the Array");
        for (int arriItem = 0; arriItem < n; arriItem++) {
            arr[arriItem] = scanner.nextInt();
        }

        System.out.println( "Reverse Array: " );
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0){
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
