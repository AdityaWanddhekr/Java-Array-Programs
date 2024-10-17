import java.util.Scanner;

public class Array_88 {

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static int[] moveZeroEnd(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            if (a[i] == 0 && a[j] != 0) {
                swap(a, i, j);
                i++;
                j--;
            }
            if (a[i] != 0 && a[j] != 0) {
                i++;
            } else {
                j--;
            }
        }
        return a;
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

        System.out.println("Enter the element in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Before move all zero to end array is : ");
        printf(a);
        System.out.println();
        int move[] = moveZeroEnd(a);
        System.out.println("After move all zero to end array is : ");
        printf(move);
        sc.close();
    }
}
