import java.util.*;
public class Array_25
{
     //2. Write a program  to sort an Array in Descending order using bubble sort.

    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
      
          System.out.println("Enter the size : ");// Array 1
          int sizea=sc.nextInt();
       
          int a[]=new int[sizea];
          System.out.println("Enter array element  : ");
          for(int i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
          }

          System.out.println("Array before Sorting in Decending Order : ");

          for(int i=0;i<a.length;i++)
          {
            System.out.print(a[i]+" ");
          }
 
          System.out.println();
      
          for(int i=0;i<a.length-1;i++)
          {
             for(int j=i+1;j<a.length;j++)
             {
                 if(a[i]<a[j])
                 {
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
              }
          }

          System.out.println("Array after Sorting in Decending Order : ");

          for(int i=0;i<a.length;i++)
          {
            System.out.print(a[i]+" ");
          }
 
          
    }
}