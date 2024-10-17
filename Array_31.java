import java.util.*;

public class Array_31 {
    // 7. Write a program to merge two array consecutively.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of a : ");// Array 1
        int sizea = sc.nextInt();

        int a[] = new int[sizea];
        System.out.println("Enter array element of a  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The Array a  is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter the size of b : ");// Array 1
        int sizeb = sc.nextInt();

        int b[] = new int[sizeb];
        System.out.println("Enter array element of b : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("The Array b is : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        int c[] = new int[a.length + b.length];
        int k = 0;
        int l = 0;

        for (int i = 0; i < c.length; i++) {
            if (k < a.length) {
                c[i++] = a[k++];
            }
            if (l < b.length) {
                c[i] = b[l++];
            }
        }

        System.out.println();
        System.out.println("The Array after merge consegative c is : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}