package Algorithms.Implementation.GradingStudents;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        System.out.println("How many total grade input?");
        int n = sc.nextInt();
        System.out.println("Enter each student's grade");
        int grades[] = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        System.out.println("Final Grade");
        for (int i = 0; i < n; i++) {
            if (grades[i] >= 38 && (grades[i] % 5) == 0) {
                System.out.println(grades[i]);
                } else if (grades[i] >= 38 && (grades[i] % 5) != 0) {
                    int sum = grades[i];
                    while ((sum % 5) !=0){
                            sum = sum + 1;
                        } if (sum - grades[i] < 3){
                            System.out.println(sum);
                        } else{
                            System.out.println(grades[i]);
                        }
                } else if (grades[i]< 38) {
                    System.out.println(grades[i]);
                }
        }
    }
}

