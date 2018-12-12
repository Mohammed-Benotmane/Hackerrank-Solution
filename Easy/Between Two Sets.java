import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        boolean var,var2;int i;int j;int m=0;
        for(i=a[a.length-1];i<=b[0];i++){
            var = false;
            for(j=0;j<a.length;j++){
                if(i%a[j]==0){
                    var =true;
                }else{
                    var =false;
                    break;
                }
            }
            if(var==true){
                var2=false;
                for(int k=0;k<b.length;k++){
                    if(b[k]%i==0){
                        var2=true;
                    }else{
                        var2=false;
                        break;
                    }
                   
                }
                 if(var2==true){
                        m++;
                    }
            }
        }
       return m;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
