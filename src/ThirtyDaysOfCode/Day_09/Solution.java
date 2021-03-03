package ThirtyDaysOfCode.Day_09;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
        int result = 0;
        if (n <= 1){
            return 1;
        } else{
            result = n * factorial( n - 1 );
        }
        return result;
    }

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( System.getenv( "OUTPUT_PATH" ) ) );

        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int result = factorial( n );

        bufferedWriter.write( String.valueOf( result ) );
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
