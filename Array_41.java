import java.util.*;

public class Array_41
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
       
       for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }

       System.out.println("Array is : ");
       for(int i=0;i<a.length;i++)
       {
          System.out.println(a[i]);
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
      
       int count=0;
       for(int i=0;i<a.length;i++)
       {
          if(a[a.length-1]==a[i]){
            count++;
         }
       }
      System.out.println("Second Largest is : "+a[a.length-(count+1)]);
   }
}