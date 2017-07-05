import java.io.*;
import java.util.*;
public class countdigit
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
        count++;
        }
        System.out.println(count);
    }
}



