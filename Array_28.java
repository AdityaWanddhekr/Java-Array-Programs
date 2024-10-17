import java.util.*;
public class Array_28
{
     //5. Write a program to insert an element in an array on a said position.

   public static void main(String[] args)
   {
          Scanner sc=new Scanner(System.in);
      
          System.out.println("Enter the size : ");// Array 1
          int size=sc.nextInt();
       
          int a[]=new int[size+1];
          System.out.println("Enter array element  : ");
          for(int i=0;i<size;i++)
          {
              a[i]=sc.nextInt();
          }
       
          System.out.println("The Array before insert element is : ");
          for(int i=0;i<size;i++)
          {
              System.out.print(a[i]+" ");
          }

          System.out.println("Enter the position : ");
          int position=sc.nextInt();
          System.out.println("Enter the element : ");
          int element=sc.nextInt();

          for(int i=size-1;i>=position;i--)
          {
              a[i+1]=a[i];
          }
         
          a[position]=element;

          System.out.println("The Array after insert element is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }

   }
}