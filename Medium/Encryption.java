import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
            s= s.replaceAll(" ", "");
            int length = s.length();
            int nRow, nColumn;
            if(Math.sqrt(length) == (int) Math.sqrt(length)){
                nRow = nColumn = (int) Math.sqrt(length);
            }else{
                nRow = (int) Math.sqrt(length);
                nColumn = nRow+1;
            }

            if(nColumn * nRow < length) nRow++;

            char[][] matrice = new char[nRow][nColumn];
            int index = 0;
            for(int i = 0; i < nRow;i++){
                for(int j = 0; j < nColumn;j++){
                    if(index < length){
                        matrice[i][j] = s.charAt(index);
                    }else{
                        matrice[i][j] = '0';
                    }
                    index++;
                }
            }
            String result = "";
            for(int i = 0; i < nColumn;i++){
                for(int j = 0; j < nRow;j++){
                    result+= matrice[j][i];
                }
                result += " ";
            }
            result = result.replaceAll("0","");
            return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}