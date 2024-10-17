import java.util.*;
public class Array_2
{

     //Q. WAP to create array of size 5 and find the max and min value from array?

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array : ");
       int size=sc.nextInt();
  
       int a[]=new int[size];
   
       System.out.println("Enter the values of the Array : ");
       for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }
 
       System.out.println("The array is : ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }

       int max=a[0];
       int min=a[0];
       for(int i=0;i<a.length;i++)
       {
          if(a[i]>max)
          {
             max=a[i];
          }
          if(a[i]<min)
          {
             min=a[i];
          }
       }
      
       System.out.println("Maximun value of array is : "+max);
       System.out.println("Minimum value of array is : "+min);

   }
}