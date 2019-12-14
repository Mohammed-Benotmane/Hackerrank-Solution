import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
     if(s.charAt(8)=='P'){

        String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(times[0].matches("12")){
            return times[0] + ":" + times[1] + ":" + times[2];
        }
        times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
        return times[0] + ":" + times[1] + ":" + times[2];
     }else{
         String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(times[0].matches("12")){
            times[0]= "00";
            return times[0] + ":" + times[1] + ":" + times[2];
        }
         return s.substring(0,8);
     }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
