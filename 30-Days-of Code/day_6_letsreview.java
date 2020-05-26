
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        String s[]=new String[tt];
        String sr[]=new String[tt];
        String ei="";
        String oi="";
        for(int x=0;x<tt;x++)
        {
            s[x]=sc.next();
            for(int y=0;y<s[x].length();y++)
            {
                if(y%2==0)
                {
                    ei=ei.concat(Character.toString(s[x].charAt(y)));
                }
                else
                {
                    oi=oi.concat(Character.toString(s[x].charAt(y)));
                }
            }
            sr[x]=(ei.concat(" ")).concat(oi);
            ei="";
            oi="";
        }
        for(int x=0;x<tt;x++)
        {
            System.out.println(sr[x]);
        }

    }
}
