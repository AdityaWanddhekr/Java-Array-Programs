import java.util.*;
public class Array_4
{

    //Q. WAP to create array of size 5 and reverse it means shift value of its index?

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
        System.out.println("The array before reversed is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int j=a.length-1;
        for(int i=0;i<=(j/2);i++)
        {
           
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           j--;
        }


        System.out.println("The array after reverse is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
       
    }
}