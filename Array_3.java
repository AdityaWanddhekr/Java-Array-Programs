import java.util.*;
public class Array_3
{

    //WAP to create array of size 5 and input single value from keyboard and search value present in array or not?

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
        System.out.println("The array is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the value : ");
        int val=sc.nextInt();
 
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
             {
                 found=true;
                 break; 
             }
           
        }
         if(found)
         {
             System.out.println("The value "+val+" is  Present in array.");
          }
         else
            {
                System.out.println("The value "+val+" is not Present in array."); 
            }
       
    }
}