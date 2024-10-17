import java.util.*;
public class Array_32
{
    //9. Write a program to find the sum of prime numbers of an array. 

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

           int sum=0;
          for(int i=0;i<a.length;i++)
          {
              boolean isPrime=true;
             for(int j=2;j<a[i];j++)
             {
                 if(a[i]%j==0)
                 {
                     isPrime=false;
                     break;
                 }
             }
            if(isPrime)
            {
               System.out.print(a[i]+" ");
               sum+=a[i];
            }
          }
          System.out.println("The sum of prime number present in array is : "+sum);
         
   }
}