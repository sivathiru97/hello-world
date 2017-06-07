import java.io.*;
import java.util.Scanner;
public class oddreven
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n==0)
        System.out.println("zero");
        if(n%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}


