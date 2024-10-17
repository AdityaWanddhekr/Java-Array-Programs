import java.util.*;
public class Array_13
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size : ");
      int size=sc.nextInt();
      int a[]=new int[size];
     
      System.out.println("Enter the element in array : ");
      for(int i=0;i<a.length;i++)
      {
         a[i]=sc.nextInt();
      }
      System.out.println("The array is : ");
      for(int i=0;i<a.length;i++)
      {
         System.out.println(a[i]+" ");
      }

      int ECount=0;
      int OCount=0;
      
      for(int i=0;i<a.length;i++)
      {
         if(a[i]%2==0)
         {
            ECount++;
         }
         else
         {
            OCount++;
         }
      }

      System.out.println("The even element in array are : "+ECount);
      System.out.println("The odd element in array are : "+OCount);
      
   }
}