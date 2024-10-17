import java.util.*;
public class Array_17
{
     //4. Write a program to create even arrays and odd array from a Given Array.

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

      System.out.println("The Array is : ");
      for(int i=0;i<a.length;i++)
      {
         System.out.print(a[i]+" ");
      } 

     

      int eCount=0;
      int oCount=0;

      for(int i=0;i<a.length;i++)
      {
         if(a[i]%2==0)
         {
           eCount++;
         }
         else
         {
           oCount++;
         }
      } 

      int eArray[]=new int[eCount];
      int oArray[]=new int[oCount];
      int p=0;
      int q=0;
      System.out.println();
      for(int i=0;i<a.length;i++)
      {
        if(a[i]%2==0)
        {
           eArray[p++]=a[i];
        }
        else
        {
           oArray[q++]=a[i];
        }
      }
      
      System.out.println();
      for(int i=0;i<eArray.length;i++)
      {
        System.out.print(eArray[i]+" ");
      }
      System.out.println();
      for(int i=0;i<oArray.length;i++)
      {
        System.out.print(oArray[i]+" ");
      }
   }
}