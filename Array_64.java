import java.util.*;

public class Array_64 {

    // suffix array with using anoy=ther array.
    public static int[] suffixArray(int a[]) {
        int suffixArray[] = new int[a.length];
        suffixArray[a.length - 1] = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            suffixArray[i] = suffixArray[i + 1] + a[i];
        }
        return suffixArray;
    }

    public static void printf(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int suffix[] = suffixArray(a);
        printf(suffix);
        sc.close();
    }
}
