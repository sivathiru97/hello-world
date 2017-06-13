import java.io.*;
import java.util.*;
public class Alpharnot 
{
    public static void main(String[] args) 
{
    Scanner sc=new Scanner (System.in);
    char n=sc.next().charAt(0);
    if(n>='a'&&n<='z' || n>='A'&&n<='Z')
    {
        System.out.print("the given character is Alphabet");
    }
    else
    {
        System.out.print("the given character is not Alphabet");
    }
}
}
