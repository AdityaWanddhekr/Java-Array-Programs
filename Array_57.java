import java.util.Scanner;

public class Array_57 {

    // sort 0 and 1 array optimised approch.

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sortoneAndzero(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] == 1 && a[right] == 0) {
                swap(a, left, right);
                left++;
                right--;
            }
            if (a[left] == 0) {
                left++;
            }
            if (a[right] == 1) {
                right--;
            }

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

        sortoneAndzero(a);
        System.out.println("The array after sorting 0 and 1 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
