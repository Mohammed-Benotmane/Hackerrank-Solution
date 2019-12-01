import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String STDIN = scanner.nextLine();
        
        for(int i=0;i<Integer.parseInt(STDIN);i++){
            String word = scanner.nextLine();
            String temp1="";
            String temp2="";
            for(int j=0;j<word.length();j++){
                if(j%2==0){
                    temp1 +=word.charAt(j);
                }else{
                    temp2 +=word.charAt(j);
                }
            }
            System.out.println(temp1 + " " + temp2);
        }

    }
}

