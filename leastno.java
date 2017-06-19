import java.io.*;
import java.util.*;
class leastno
{
public static void main(String args[])
{
int i=0,j=0;
Scanner sc=neew Scanner(System.in);
String s=sc.next();
int a=Integer.parseInt(s);
int dig=sc.nextInt();
int a[]=new int[s.length()];
for(i=0;i<s.length();i++)
{
a[i]=a%10;
a=a/10;
}
Arrays.sort(a);
for(j=0;j<s.length()-dig;j++)
{
System.out.println(a[j]):
}
}
}
