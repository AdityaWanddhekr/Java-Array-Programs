import java.util.Scanner;

public class Array_93 {

    // Count smaller and equal elements.

    public static int smallEqual(int a[], int val) {
        int l = 0;
        int h = a.length - 1;
        int mid = 0;

        while (l <= h) {
            mid = (l + h) / 2;
            if (a[mid] == val) {
                while (mid + 1 < a.length && a[mid] == a[mid + 1]) {
                    mid++;
                }
                break;
            } else if (val >= a[l] && val < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (a[mid] > val) {
            return mid;
        } else {
            return mid + 1;
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

        System.out.println("Enter the value : ");
        int val = sc.nextInt();

        int count = smallEqual(a, val);
        System.out.println("The smaller and equal elements are : " + count);
        sc.close();
    }
}
