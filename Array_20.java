import java.util.*;
public class Array_20
{

    // 7. Write a program  to sort an Array in ascending order using bubble sort. 

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
      
      System.out.println("Array before sorting  : ");
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
      
      for(int i=0;i<a.length;i++)
      {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
      }
      System.out.println();
      System.out.println("Array after sorting  : ");
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
      
    }
}