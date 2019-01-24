import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        a = sortList(a);
        int max =0;
        int length;
        for(int i =0; i < a.size();i++){
            length =0;
            for(int j =i; j < a.size();j++){
                if(a.get(j) - a.get(i) > 1){
                    break;
                }else{
                 length++;
                }
            }
            if(max < length) max = length;
        }
        return max;
    }

    public static List<Integer> sortList(List<Integer> list){
        int min =0;
        for(int i =0; i < list.size()-1;i++){
            min = list.get(i);
            for(int j= i+1; j < list.size();j++){
                if(min > list.get(j)){
                    list.set(i, list.get(j));
                    list.set(j, min);
                    min = list.get(i);
                }
            }
        }
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}