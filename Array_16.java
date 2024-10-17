import java.util.*;
public class Array_16
{

    // 3. Write a program to compute the sum of even and odd numbers stored in an array of n integers.

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

      int eSum=0;
      int oSum=0;

      for(int i=0;i<a.length;i++)
      {
         if(a[i]%2==0)
         {
            eSum+=a[i];
         }
         else
         {
            oSum+=a[i];
         }
      }
      System.out.println("Sum of even elements is : "+eSum);
      System.out.println("Sum of odd elements is : "+oSum);
      
   }
}