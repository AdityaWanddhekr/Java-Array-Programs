import java.util.*;
public class Array_37
{

     // 4. Write a program to rotate said no of elements from an array from start. 

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

           System.out.println("Enter the number : ");
           int num=sc.nextInt();
          
           
           for(int i=0;i<num;i++)
           {
               int temp=a[0];
              for(int j=0;j<a.length-1;j++)
              {
                 a[j]=a[j+1];
              }
            a[a.length-1]=temp;
           }

          System.out.println("The array is  : ");
          for(int i=0;i<a.length;i++)
          {
               System.out.print(a[i]+" ");
          }
          
   }
}