// Question: https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i, j, k;
        for(i = n; i > 0; i--){
            for(j = i-1; j > 0; j--){
                System.out.print(" ");
            }
            for(k = i; k <= n; k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
