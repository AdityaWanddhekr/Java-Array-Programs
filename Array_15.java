import java.util.*;
public class Array_15
{
   //2. Write a program to print the numbers from an array which are divisible by 9 and not by 6.
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

      for(int i=0;i<a.length;i++)
      {
         if(a[i]%9==0 || a[i]%6!=0)
         {
            System.out.print(a[i]+" ");
         }
      }
   }
}