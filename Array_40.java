import java.util.*;
public class Array_40
{
   // 6. Write a program to reverse array elements using for loop.
 
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
     int j=a.length-1;
     for(int i=0;i<a.length/2;i++)
     {
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
         j--;
     }

          System.out.println();
          System.out.println("The Reversed Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
  }
}