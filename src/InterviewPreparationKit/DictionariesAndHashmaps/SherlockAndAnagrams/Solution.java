package InterviewPreparationKit.DictionariesAndHashmaps.SherlockAndAnagrams;

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

class Result {
    public static int sherlockAndAnagrams(String s) {

        int count = 0;
        Map<String,Integer> map = new HashMap<>();

        // finding anagram forms
        for(int i=0;i<s.length();i++){
            for(int j=i+1; j<=s.length();j++){
                String anagram = s.substring(i,j);
                char[] arr = anagram.toCharArray();
                Arrays.sort(arr);
                anagram = new String(arr);
                map.put(anagram, (map.get(anagram)) == null ? 1:map.get(anagram) + 1);
            }
        }

        // counting how many anagram pairs
        Collection<Integer> it = map.values();
        for(Integer val : it){
            if(val<2) continue;
            for(int i = 0; i < val ;i++){

                for(int j = i+1; j < val;j++){
                    count +=1;
                }
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
