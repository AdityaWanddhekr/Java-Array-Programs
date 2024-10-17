import java.util.*;
public class Array_19
{

     // 6. Write a program to search given element in array also print its position.

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
     
      System.out.println("Enter the element : ");
      int element=sc.nextInt();
    
      for(int i=0;i<a.length;i++)
      {
         if(a[i]==element)
         {
            System.out.println("The element is : "+a[i]);
            System.out.println("The position of element is : "+i);
            
         }
      }
      
   }
}