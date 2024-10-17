import java.util.*;
public class Array_22
{

   // 9. Write a program to  swap  two given elements in an Array.

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
      System.out.println();
      System.out.println("Array before swap  : ");
      for(int i=0;i<a.length;i++)
      {
         System.out.print(a[i]+" ");
      }
      System.out.println();
      System.out.println("Enter the element1 : ");
      int ele1=sc.nextInt();
      System.out.println("Enter the element1 : ");
      int ele2=sc.nextInt();
      int pos1=-1;
      int pos2=-1;
      for(int i=0;i<a.length;i++)
      {
         if(ele1==a[i])
         {
            pos1=i;
         }
         if(ele2==a[i])
         {
            pos2=i;
         }
      }
      System.out.println("pos 1 :"+pos1+"\npos 2 :"+pos2);

      System.out.println("The array after swap element : ");
      for(int i=0;i<a.length;i++){
         int temp=a[pos1];
         a[pos1]= a[pos2];
         a[pos2]=temp;
        
      }
      System.out.println();
      for(int i=0;i<a.length;i++){
        
        System.out.print(a[i]+" ");
      }
   }
}