import java.util.Scanner;

public class Array_66 {

    // equal subarray by suffix array.

    public static int[] prefixArray(int a[]) {
        int prefixArray[] = new int[a.length];
        prefixArray[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + a[i];
        }
        return prefixArray;
    }

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

    public static boolean equalSubArray(int a[]) {
        int prefix[] = prefixArray(a);
        int suffix[] = suffixArray(a);

        for (int i = 0; i < a.length - 1; i++) {
            if (prefix[i] == suffix[i + 1]) {
                return true;
            }
        }
        return false;
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

        System.out.println("The equal sunarray is : " + equalSubArray(a));

        sc.close();
    }
}
