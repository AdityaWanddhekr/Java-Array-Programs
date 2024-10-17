import java.util.Scanner;

public class Array_90 {

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void moveZero(int a[]) {
        int size = a.length;
        if (size == 1 || size == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        while (j < size) {
            if (a[j] != 0) {
                swap(a, j, i);
                i++;
                j++;
            } else {
                j++;
            }
        }
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

        moveZero(a);
        printf(a);

        sc.close();
    }
}
