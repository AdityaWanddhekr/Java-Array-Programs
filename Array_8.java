import java.util.*;
public class Array_8
{
   public static void main(String[] args)
   {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the Array : ");
         int size=sc.nextInt();
         
         int a[]=new int[size];
 
         System.out.println("Enter the values of Array : ");
           for(int i=0;i<a.length;i++)
           {
               a[i]=sc.nextInt();
           }

           int max=Integer.MIN_VALUE;
           int smax=Integer.MIN_VALUE;
         
          for(int i=0;i<a.length;i++)
           {
              if(a[i]>max)
               {
                  smax=max;
                  max=a[i];
               }
              else
               {
                  if(a[i]>smax && a[i]!=max)
                  {
                     smax=a[i];
                  } 
               }
           }
           System.out.println("Second Max is : "+smax);
         
   }
}