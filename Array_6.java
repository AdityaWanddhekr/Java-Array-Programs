import java.util.*;
public class Array_6
{

    //Q. WAP to create array of size 5 and calculate sum of all values.

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
   
        int a[]=new int[size];

        System.out.println("Enter the values of the array : ");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }

        System.out.println("The array  is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

         int sum=0;
        for(int i=0;i<a.length;i++)
        {
           sum+=a[i];
        }
       
       System.out.println("The sum of array values is : "+sum);
    }
}