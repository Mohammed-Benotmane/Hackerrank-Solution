import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long[] m = new long[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j != i){
                    m[i]+=arr[j];
                }
            }
        }
        long min = m[0];
        long max = m[0];
        for(int k=1;k<arr.length;k++){
            if(m[k]<min){
                min=m[k];
            }
            if(m[k]>max){
                max=m[k];
            }
        }
        System.out.print(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
