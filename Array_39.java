import java.util.*;
public class Array_39
{
    // 6. Write a program to reverse array elements.

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

          int start=0;
          int end=a.length-1;
          while(start<end){
             int temp=a[start];
             a[start]=a[end];
             a[end]=temp;
       
            start++;
            end--;
          }
          System.out.println();
          System.out.println("The Reversed Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }

  }
}