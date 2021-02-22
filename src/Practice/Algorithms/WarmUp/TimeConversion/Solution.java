package Practice.Algorithms.WarmUp.TimeConversion;

import java.io.*;
import java.util.*;


public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String minuteSecond = s.substring( 2, s.length() - 2 );
        if(s.substring( s.length() -2 ).equals( "AM" )){ // check the last 2 input of the string is AM
            // the first 2 input of the string is = 12 => add to 00 if not then keep it
            String hour =(Integer.parseInt( s.substring( 0,2 )) == 12) ? "00" : s.substring( 0,2 );
            return hour.concat( minuteSecond );
        }else {
            // the first 2 input of the string is = 12 => add to 12 if not then convert to int and +12
            String hour = (Integer.parseInt( s.substring( 0, 2 ) ) == 12) ? "12" : String.valueOf(Integer.valueOf(s.substring( 0, 2 )) + 12) ;
            return hour + minuteSecond;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( System.in );
        String s = in.next();
        String result = timeConversion( s );
        System.out.println( result );
    }
}
