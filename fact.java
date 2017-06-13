import java.io.*;
import java.util.*;
class fact
{
    public static void main(String args[])
    {
        int fact=1,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
