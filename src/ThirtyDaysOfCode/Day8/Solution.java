package ThirtyDaysOfCode.Day8;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        System.out.println("How many contact?");
        Scanner in = new Scanner( System.in );
        //  read how many contact to add into the phone book
        int n = in.nextInt();
        System.out.println("Enter name and phone number");
        //  create a phone book Map
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        //  Enter contact into phoneBook
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put( name, phone );
        }
        System.out.println( "Enter name to look up phone number" );
        //  Look-up contact into phoneBook by enter name
        while (in.hasNext()) {
            String name = in.nextLine();
            //  Check phonebook if it contain the name
            if (phoneBook.containsKey( name )) {
                System.out.println( name + "=" + phoneBook.get( name ) );
            } else {
                System.out.println( "Not found" );
            }
        }
        in.close();
    }
}
