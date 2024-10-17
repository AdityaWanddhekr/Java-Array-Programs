import java.util.*;
public class Array_12
{
    // Find the biggest element in array.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size : ");
      int size=sc.nextInt();
      int a[]=new int[size];

      System.out.println("Enter the element : ");
      for(int i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("The Array is : ");
      for(int i=0;i<a.length;i++)
      {
         System.out.println(a[i]+" ");
      }
      int big=Integer.MIN_VALUE;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]>big)
        {
          big=a[i];
        }
      }
      System.out.println("Big element in array is  : "+big);
   }
}