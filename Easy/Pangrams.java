import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        s = s. replaceAll("\\s","");
        boolean[] alphabet=new boolean[26];
        char temp;
        for(int i=0;i<26;i++){
            alphabet[i]= false;
        }
        for(int i=0;i<s.length();i++){
            temp = s.charAt(i);
            alphabet[((int)Character.toLowerCase(temp))-97]=true;
        }
        for(int i=0;i<26;i++){
            if(!alphabet[i]){
                return "not pangram";
            }
        }
        return "pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
