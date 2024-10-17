import java.util.*;
public class Array_5
{

    //Q. Q. WAP to create array of size 5 and arrange all in ascending and descending order?

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

        for(int i=0;i<a.length;i++)
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
       
        System.out.println("The array in decending order is : ");
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
       
        System.out.println("The array in Accending order is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}