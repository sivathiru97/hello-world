import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])
{
int n=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextInt();
char c[]=s.tocharArray();
for(i=0;i<s.length;i++)
{
n++;
}
System.out.pritnln(n);
}
}
