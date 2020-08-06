import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int errorsOnOneSOS(String sos){
        int temp=0;
        if(sos.charAt(0)!='S')
            temp++;
        if(sos.charAt(1)!='O')
            temp++;
        if(sos.charAt(2)!='S')
            temp++;
        return temp;
    }

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int sum=0;
        for(int i = 0; i< s.length()-2;i+=3){
            sum += errorsOnOneSOS(s.substring(i,i+3));
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
