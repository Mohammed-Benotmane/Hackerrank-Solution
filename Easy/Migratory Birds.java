import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] types = new int[5];
        for(int i=0; i<arr.size(); i++){
            switch(arr.get(i)){
                case 1:
                    types[0]++;
                    break;
                case 2:
                    types[1]++;
                    break;
                case 3:
                    types[2]++;
                    break;
                case 4:
                    types[3]++;
                    break;
                case 5:
                    types[4]++;
                    break;
            }
        }
        int max = types[0];
        int index = 1;
        for(int j = 1; j<types.length;j++){
            if(max < types[j]){
                max = types[j];
                index = j+1;
            }
        }
        return index;
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
