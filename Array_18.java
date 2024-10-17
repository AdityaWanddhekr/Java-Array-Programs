import java.util.*;
public class Array_18
{
    // 5. Write a program to find mean and standard deviation of n numbers.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size : ");
      int size=sc.nextInt();
       
      int a[]=new int[size];
      System.out.println("Enter array element  : ");
      for(int i=0;i<a.length;i++)
      {
         a[i]=sc.nextInt();
      }
      
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
         sum+=a[i];
      }
      double mean=(double)sum/a.length;
      System.out.println("Mean is : "+mean);

     
      double SD=0;
      for(int i=0;i<a.length;i++)
      {
         double sq=(double)Math.pow(mean-a[i],2);
         sum+=sq;
         SD=(double)Math.sqrt(sum/a.length);
      }
      
      System.out.println("The SD is : "+SD);
   }
}