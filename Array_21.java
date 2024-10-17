import java.util.*;
public class Array_21
{
     //8. Write a program to Check whether a given array is Sorted in Ascending order or not.

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
      
      boolean isSorted=true;
  
      for(int i=0;i<a.length-1;i++)
      {
        
             if(a[i]>a[i+1])
              {
                 isSorted=false;
                 break;
              }
          
       
      }
       if(isSorted)
        {
            System.out.println("The array is Sorted!...");
        }
        else{
            System.out.println("The array is not Sorted!...");
        }
   }
}