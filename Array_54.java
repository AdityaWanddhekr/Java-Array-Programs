import java.util.Scanner;

public class Array_54 {

    // rotate array by k step inplace.

    public static void swap(int a[], int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void reverse(int a[], int i, int j) {

        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void roatateArray(int a[], int k) {
        k = k % a.length;
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
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

        System.out.println();
        System.out.println("Enter the k step to roatate : ");
        int k = sc.nextInt();

        roatateArray(a, k);
        printArray(a);
        sc.close();
    }
}
