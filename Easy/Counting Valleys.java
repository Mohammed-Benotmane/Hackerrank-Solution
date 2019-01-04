import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int sea = 0, counter = 0; boolean above = false, below = false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                sea--;
            }else sea++;
            if(sea > 0) {
               above = true;
               if(below){
                below = false;
                counter ++;
               }
            }
            if(sea < 0){
                below = true;
                if(above){
                above = false;
                }
            }
            if(sea == 0 && below){
                below = false;
                counter++;
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
