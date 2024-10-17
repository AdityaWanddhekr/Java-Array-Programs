import java.util.*;
public class Array_42
{
     // rotate array with said number by end.

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the size : ");
       int size=sc.nextInt();

       int a[]=new int[size];
       
       System.out.println("Enter the element : ");
       for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }

       System.out.println("The Array before roatating is  : ");
       for(int i=0;i<a.length;i++)
       {
          System.out.print(a[i]+" ");
       }
       System.out.println();
       //System.out.println("Enter the number : ");
       //int num=sc.nextInt();

      
       
            int temp=a[a.length-1];
            
          for(int j=0;j<a.length-1;j++)
          {
            
              System.out.println(a[j]);
                a[j+1]=a[j];
          }
          a[0]=temp;
       
        System.out.println();
        System.out.println("The Array after rotating is  : ");
       for(int i=0;i<a.length;i++)
       {
          System.out.print(a[i]+" ");
       }

 
        
   }
}