import java.util.*;

public class Array_29 {
    // 6. Write a program to delete an element from an array.

    public static int removeElement(int[] a, int val) {
        int i = 0;
        int k = 0;
        while (i < a.length) {
            if (a[i] != val) {
                a[k++] = a[i];
            }
            i++;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");// Array 1
        int size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter array element  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("The Array before delete is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter the position of element to delete : ");
        int position = sc.nextInt();

        int len = removeElement(a, position);
        System.out.println("Len is : " + len);
        System.out.println();
        System.out.println("The Array after deleter element is : ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
