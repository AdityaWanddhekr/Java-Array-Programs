import java.util.*;
public class Array_24
{
     //1. Write a program to find common elements between two arrays.

   public static void main(String[] args)
   {
          Scanner sc=new Scanner(System.in);
      
          System.out.println("Enter the size : ");// Array 1
          int sizea=sc.nextInt();
       
          int a[]=new int[sizea];
          System.out.println("Enter array element  : ");
          for(int i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
          }

          System.out.println();
          System.out.println("Enter the size : ");// Array 2
          int sizeb=sc.nextInt();
       
          int b[]=new int[sizeb];
          System.out.println("Enter array element  : ");
          for(int i=0;i<b.length;i++)
          {
              b[i]=sc.nextInt();
          }

          System.out.println();
          System.out.println("The Array a is : ");
          for(int i=0;i<a.length;i++)
          {
            System.out.println(a[i]+" ");
          }

          System.out.println();
          System.out.println("The Array b is : ");
          for(int i=0;i<b.length;i++)
          {
            System.out.println(b[i]+" ");
          }
 

          System.out.println();
          System.out.println("The common elements in Array are : ");
          for(int i=0;i<a.length;i++)
          {
              for(int j=0;j<b.length;j++)
              {
                  if(a[i]==b[j])
                  {
                      System.out.print(a[i]+" ");
                  }
              }
          }
       
   }
}