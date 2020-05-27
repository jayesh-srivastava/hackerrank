//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1 && n<=100000)
        {
            Map<String,Integer> map=new HashMap<>();
            String na[]=new String[n];
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                map.put(name,phone);
                name="";
                phone=0;
            }
            int x=-1;
            while(in.hasNext())
            {
                x++;
                na[x]=in.next();
            }
            for(int i=0;i<x+1;i++)
            {
                if(map.containsKey(na[i]))
                {
                    System.out.println(na[i]+"="+map.get(na[i]));
                }
                else
                    System.out.println("Not found");
            }
            in.close();
        }
    }
}
