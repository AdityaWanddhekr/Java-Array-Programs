import java.util.*;
public class Array_7
{

       // Find the second largest using sorting array.
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

         System.out.println("The Array is : ");
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
         System.out.println("The Array after sorting is : ");
           for(int i=0;i<a.length;i++)
           {
               System.out.print(a[i]+" ");
           }

           int count=0;
           int second_large=0;
         for(int i=0;i<a.length;i++)
           {
               if(a[a.length-1]==a[i])
               {
                    count++;
               }
              
           }
          System.out.println();
             second_large=a[(a.length)-(count+1)];
             System.out.println("The Second lasrgest is : "+second_large);
    }
}