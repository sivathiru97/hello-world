import java.io.*;
import java.util.*;
public class revinteger {
 
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String revstring="";
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);
}
}

