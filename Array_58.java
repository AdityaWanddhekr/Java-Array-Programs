import java.util.Scanner;

public class Array_58 {

    // sort array such that all even number at left and odd at right order doesn't
    // matter.

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sortEvenOdd(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if ((a[left] % 2 == 1) && (a[right] % 2 == 0)) {
                swap(a, left, right);
                left++;
                right--;

            }
            if (a[left] % 2 == 0) {
                left++;
            }
            if (a[right] % 2 != 0) {
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

        sortEvenOdd(a);
        System.out.println("The array after sort even odd : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
