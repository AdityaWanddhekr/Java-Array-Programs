import java.util.Scanner;

public class Array_77 {

    // Binary search in rotated sorted array.

    public static int rotatedSored(int a[], int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (a[l] <= a[mid]) {
                if (key >= a[l] && key < a[mid]) {
                    h = mid - 1;

                } else {
                    l = mid + 1;
                }

            } else {
                if (key > a[mid] && key <= a[h]) {
                    l = mid + 1;

                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be searched : ");
        int k = sc.nextInt();
        System.out.println();
        System.out.println("The key is in array at position : ");
        System.out.println(rotatedSored(a, k));

        sc.close();
    }
}
