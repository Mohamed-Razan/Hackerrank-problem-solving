// Question: https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int a = 0, b = 0, c = 0, i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                a++;
            else if(arr[i] == 0)
                b++;
            else if(arr[i] < 0)
                c++;
        }
        float x, y, z;
        x = (float)a/arr.length;
        y = (float)b/arr.length;
        z = (float)c/arr.length;
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
