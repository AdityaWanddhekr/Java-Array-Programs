import java.util.*;
public class Array_11
{
   // find the addition of n number in Array.
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
      int sum=0;
     System.out.println("The array is : ");
     for(int i=0;i<a.length;i++)
     {
        sum+=a[i];
        System.out.print(a[i]+" ");
     }
         System.out.println();
        System.out.println("The sum of array is : "+sum);

    
   }
}