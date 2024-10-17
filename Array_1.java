import java.util.*;

public class Array_1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array : ");
      int size = sc.nextInt();

      int a[] = new int[size];

      System.out.println("Enter the values of array : ");
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
      }

      System.out.println("The array is : ");
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }

      sc.close();
   }
}