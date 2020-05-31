import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s="";
        String max="";
        while(n!=0)
        {
            int d=n%2;
            n=n/2;
            if(d==1)
            {
                s=s+d;
            }
            else
            {
                if(max.length()<=s.length())
                {
                    max=s;
                    s="";
                }
                else
                {
                    s="";
                }
            }
        }
        if(s.length()>=max.length())
            System.out.println(s.length());
        else
            System.out.println(max.length());    
        scanner.close();
    }
}

