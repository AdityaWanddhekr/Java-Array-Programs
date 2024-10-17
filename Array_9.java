import java.util.*;
public class Array_9
{
    // Print Array with their respective position.
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size :");
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
        System.out.print(a[i]+" ");
      }
   }
}