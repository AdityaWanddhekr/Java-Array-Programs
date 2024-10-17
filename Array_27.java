import java.util.*;
public class Array_27
{
    //4. Write a program to divide an array from its mid into two arrays.

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

          System.out.println("The Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }

          int mid=a.length/2;
          int f[]=new int[mid];
          int s[]=new int[a.length-mid];
          int si=0;

          for(int i=0;i<a.length;i++)
          {
             if(i<mid){
               f[i]=a[i];
             }
             else
             {
               s[si++]=a[i];
             }
          }
 
          System.out.println();
          System.out.println("The first array is : ");
          for(int i=0;i<f.length;i++)
          {
             System.out.print(f[i]+" ");
          }

          System.out.println();
          System.out.println("The second array is : ");
          for(int i=0;i<s.length;i++)
          {
             System.out.print(s[i]+" ");
          }

   }
}