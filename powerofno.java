import java.io.*;
import java.util.*;
public class powerofno
{
public static void main(String args[])
{
 int n=5,p=3,result=1;
 
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	 {
            result=result*n;
 	 }	    
     }
    System.out.println(n+"^"+p+"="+result);
	
  }
}
