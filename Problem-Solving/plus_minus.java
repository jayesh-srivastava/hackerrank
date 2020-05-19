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
        int countp=0;
        int countn=0;
        int countz=0;
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==0)
            {
                countz++;
            }
            else if(arr[x]>0)
            {
                countp++;
            }
            else
            {
                countn++;
            }
        }
        System.out.println((double)countp/arr.length);
        System.out.println((double)countn/arr.length);
        System.out.println((double)countz/arr.length);

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
