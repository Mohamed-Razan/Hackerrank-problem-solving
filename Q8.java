// Question: https://www.hackerrank.com/challenges/mini-max-sum/problem

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
        long max = arr[0], min = arr[0], sumMax = 0, sumMin = 0;
        int i, count1 = 0, count2 = 0;
        for(i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        for(i = 0; i < arr.length; i++){
            if((arr[i] == max) && (count1 == 0)){
                count1 = 1;
            }
            else{
                sumMin = sumMin + arr[i];
            }
            if((arr[i] == min) && (count2 == 0)){
                count2 = 1;
            }
            else{
                sumMax = sumMax + arr[i];
            }
        }
        System.out.println(sumMin+" "+sumMax);
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
