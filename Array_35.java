import java.util.*;
public class Array_35
{
    //2. Write a program to take a input as binary number array and convert it to Decimal Number 
//array.

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
             int dec=0;
             while(a[i]>0)
             {
                int last=a[i]%10;
                dec+=Math.pow(2,pow)*last;
                a[i]/=10;
                pow++;
             }
           a[i]=dec;
          }
     
          System.out.println();
          System.out.println("The Decimal Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
   }
}