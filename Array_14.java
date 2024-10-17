import java.util.*;
public class Array_14
{
    //1. Write a program to count positive , Negative and zero element in An Array.
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

      System.out.println("Array is  : ");
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }

      int zCount=0;
      int pCount=0;
      int nCount=0;

      for(int i=0;i<a.length;i++)
      {
         if(a[i]>0)
         {
            pCount++;
         }
         else if(a[i]<0)
         {
            nCount++;
         }
         else
         {
            zCount++;
         }
      }
      
       System.out.println("Positive elemnts are : "+pCount);
       System.out.println("Negative elemnts are : "+nCount);
       System.out.println("Zero elemnts are : "+zCount);
      
   }
}