// Question: https://www.hackerrank.com/challenges/time-conversion/problem

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
        String t = s.substring(8,10);
        String u = s.substring(0,2);
        String w = s.substring(2,8);
        if(t.equals("AM")){
            if(u.equals("12")){
                return "00"+w;
            }
            else{
                return u+w;
            }
        }
        else{
            if(u.equals("12")){
                return u+w;
            }
            else{
                int a = Integer.parseInt(u)+12;
                String v = Integer.toString(a);
                return v+w;
            }
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
