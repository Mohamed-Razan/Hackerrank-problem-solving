// Question: https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
        int i, j, n, sum1 = 0, sum2 = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int a[][] = new int[n][n];
        int x = 0, y = n-1;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        } 
        for(i = 0; i < n; i++){
            sum1 = sum1 + a[i][x];
            x++;
            sum2 = sum2 + a[i][y];
            y--;
        } 
        System.out.println(Math.abs(sum1-sum2));
    }
}
