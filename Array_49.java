import java.util.Arrays;
import java.util.Scanner;

public class Array_49 {
    // kth largest element.

    public static int kthLarge(int a[], int k) {
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[a.length - 1]) {
                count++;
            }
        }
        int large = a[a.length - (count + k)];
        return large;
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

        int k = 3;
        System.out.println("Kth largest : " + kthLarge(a, k));
        sc.close();
    }
}
