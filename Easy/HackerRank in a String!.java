import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        char[] hackerrank = {'h','a','c','k','e','r','r','a','n','k'};
        int i =0;
        int j = 0;
        while(i<hackerrank.length && j< s.length()){
            if(hackerrank[i]==s.charAt(j)){
                i++;
            }
            j++;
        }
        if(i == hackerrank.length)
            return "YES";
            return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
