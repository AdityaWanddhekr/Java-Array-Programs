import java.util.*;
public class Array_30
{
   //8. Write a program to merge array one after another. 

  public static void main(String[] args)
  {
          Scanner sc=new Scanner(System.in);
      
          System.out.println("Enter the size of a : ");// Array 1
          int sizea=sc.nextInt();
       
          int a[]=new int[sizea];
          System.out.println("Enter array element of a  : ");
          for(int i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
          }

          System.out.println("The Array a  is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }

          System.out.println();
          System.out.println("Enter the size of b : ");// Array 1
          int sizeb=sc.nextInt();
       
          int b[]=new int[sizeb];
          System.out.println("Enter array element of b : ");
          for(int i=0;i<b.length;i++)
          {
              b[i]=sc.nextInt();
          }

          System.out.println("The Array b is : ");
          for(int i=0;i<b.length;i++)
          {
              System.out.print(b[i]+" ");
          }

          int c[]=new int[(a.length)+(b.length)];
          int p=0;

          for(int i=0;i<a.length;i++)
          {
              c[p++]=a[i];
          }
          for(int i=0;i<b.length;i++)
          {
              c[p++]=b[i];
          }
          
          System.out.println("The Array after merge one after another is : ");
          for(int i=0;i<c.length;i++)
          {
              System.out.print(c[i]+" ");
          }

  }
}