import java.util.*;
public class Array_26
{
    //3. Write a program to count prime numbers in an Array.

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

         
          int count=0;
          for(int i=0;i<a.length;i++)
          {
                  boolean isPrime=true;
              for(int j=2;j<a[i]-1;j++)
              {
                  if(a[i]%j==0)
                  {
                     isPrime=false;
                     break;
                  }
                 
              }
            if(isPrime)
            {
               System.out.println("\nThe prime elemenets are : "+a[i]+" ");
               count++;
            }
          }

          System.out.println("The count of prime number in array is : "+count);
   }
}