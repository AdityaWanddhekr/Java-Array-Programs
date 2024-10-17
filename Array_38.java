import java.util.*;
public class Array_38
{
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

          System.out.println("The Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }

          System.out.println("Enter the number to rotate : ");
          int num=sc.nextInt();
         
          for(int i=0;i<num;i++)
          {
             int temp=a.length-1;
             for(int j=0;j<a.length-1;j++)
             {
                 a[j+1]=a[j];
             }
             a[0]=temp;
          
          }
          System.out.println("The rotated Array is : ");
          for(int i=0;i<a.length;i++)
          {
              System.out.print(a[i]+" ");
          }
   }
}