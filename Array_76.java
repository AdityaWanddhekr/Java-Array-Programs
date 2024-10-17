import java.util.Scanner;

public class Array_76 {

    // Find element by Binary search in array.

    public static boolean binarySearch(int a[], int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (key == a[mid]) {
                return true;
            } else if (key < a[mid]) {
                h = mid - 1;
                // l = l;

            } else {
                l = mid + 1;
                // h = h;
            }
        }
        return false;
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

        System.out.println("Enter the key to find in array : ");
        int key = sc.nextInt();

        if (binarySearch(a, key) == true) {
            System.out.println("The element present in array.");
        } else {
            System.out.println("The element not present in array.");
        }
        sc.close();
    }
}
