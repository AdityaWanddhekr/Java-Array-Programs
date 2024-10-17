import java.util.Scanner;

public class Array_91 {
    // Remove duplicates.

    public static int removeDuplicates(int a[]) {
        int k = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[k] != a[i]) {
                k++;
                a[k] = a[i];
            }
        }
        return k;
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

        int k = removeDuplicates(a);
        for (int i = 0; i <= k; i++) {
            System.out.print(a[i]);
        }
        sc.close();
    }
}
