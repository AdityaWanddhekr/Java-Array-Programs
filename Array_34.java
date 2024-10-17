import java.util.*;
public class Array_34
{
    //1. Write a program to reverse each element of the array and assign it back to the same array 
//and print. 

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
             int rev=0;
             while(a[i]>0)
             {
                int last=a[i]%10;
                rev=rev*10+last;
                a[i]/=10;
             }
           a[i]=rev;
          }
     
          System.out.println();
          System.out.println("The rev of each element Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
   }
}