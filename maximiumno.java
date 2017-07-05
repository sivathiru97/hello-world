import java.io.*;
import java.util.*;
public class maximiumno
{

   public static void main(String[] args)
   {
      int n[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
      for (int i=0;i<n.length;i++) 
      {
         System.out.print(n[i] + " ");
      }
      
      int max=n[0];
      for (int i=1;i<n.length;i++)
      {
         if(n[i]>max)
         max=n[i];
      }
      System.out.println("max is" +max);  
   }
}


