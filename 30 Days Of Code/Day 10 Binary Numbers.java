import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int max = 0;
        int temp = 0;
        int i = 20;
        while (n != 0 && i >= 0) {
            if (n >= Math.pow(2, i)) {
                temp++;
                n -= Math.pow(2, i);
            } else {
                if (max < temp) {
                    max = temp;
                }
                temp = 0;
            }
            i--;
        }
        if (temp != 0 && max < temp) {
            max = temp;
        }
        System.out.println(max);
        scanner.close();
    }
}
