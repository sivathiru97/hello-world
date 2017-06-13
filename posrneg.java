import java.io.*;
import java.util.*;
class positiverneg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("zero");
        }
        if(n>0)
        {
            System.out.println("positive");

        }
        else
        {
            System.out.println("negative");
        }
    }
}
