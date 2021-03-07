package DataStructures.Arrays.DS_Dynamic;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        int numberOfSequences = scanner.nextInt();
        int numberOfQueries = scanner.nextInt();
        int lastAnswer = 0;
        List<List<Integer>> sequences = new ArrayList<>();
        for (int i = 0; i < numberOfSequences; i++) {
            sequences.add( new ArrayList<>() );
        }

        for (int i = 0; i < numberOfQueries; i++) {
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sequenceIndex = (x ^ lastAnswer) % numberOfSequences;
            switch (queryType) {
                case 1:
                    // Index of sequence to append y to.
                    sequences.get( sequenceIndex ).add( y );
                    break;
                case 2:
                    List<Integer> sequence = sequences.get( sequenceIndex );
                    int elementIndex = y % sequence.size();
                    lastAnswer = sequence.get( elementIndex );
                    System.out.println( lastAnswer );
                    break;
            }
        }
    }
}
