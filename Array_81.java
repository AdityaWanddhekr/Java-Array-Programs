import java.util.*;

public class Array_81 {

    // 8) . Write a program in C to merge two arrays of same size sorted in
    // decending order.

    public static int[] mergeDecending(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        int k = a.length - 1;
        int l = b.length - 1;

        for (int i = 0; i < c.length; i++) {
            if (a.length >= 0) {
                c[i++] = a[k--];
            }
            if (b.length >= 0) {
                c[i] = a[l--];
            }
        }
        return c;
    }

    public static void printf(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array A : ");
        int size1 = sc.nextInt();

        int a[] = new int[size1];

        System.out.println("Enter the elements in array A : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array B : ");
        int size2 = sc.nextInt();

        int b[] = new int[size2];

        System.out.println("Enter the elements in array B : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Array A is : ");
        printf(a);
        System.out.println();
        System.out.println("Array B is : ");
        printf(b);
        System.out.println();
        int c[] = mergeDecending(a, b);
        System.out.println("Array after merge decending sort : ");
        printf(c);
        sc.close();
    }
}
