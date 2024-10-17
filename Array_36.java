import java.util.*;
public class Array_36
{
    //3. Write a program to take a input as Decimal number array and convert it to Binary 
   //    Number array.

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
             int pow=0;
             int bin=0;
             while(a[i]>0)
             {
                int last=a[i]%2;
                bin+=Math.pow(10,pow)*last;
                a[i]/=2;
                pow++;
             }
           a[i]=bin;
          }
     
          System.out.println();
          System.out.println("The Decimal Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
   }
}