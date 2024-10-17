import java.util.Scanner;

public class Array_94 {

    // Inverse of array.

    public static int[] inverseArray(int a[]) {
        int v[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            v[j] = i;
        }
        return v;
    }

    public static void printf(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array is : ");
        printf(a);
        int v[] = inverseArray(a);
        System.out.println();
        System.out.println("Inverse Array is : ");
        printf(v);

        sc.close();
    }
}
