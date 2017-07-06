import java.io.*;
import java.util.*;
class stringcmp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equals(str2))
        {
            System.out.print("given two strings are equal");
        }
        else
        {
            System.out.print("given two strings are not equal");
        }
        
    }
}
