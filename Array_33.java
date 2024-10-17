import java.util.*;
public class Array_33
{
    //10. Write a program to  find the sum of digits of each elements of an Array.

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

          for(int i=0;i<a.length;i++)
          {
             int sum=0;
             while(a[i]>0)
             {
                int last=a[i]%10;
                sum+=last;
                a[i]/=10;
             }
           a[i]=sum;
          }
     
          System.out.println();
          System.out.println("The sum Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
   }
}