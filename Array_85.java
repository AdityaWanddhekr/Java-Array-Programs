import java.util.Scanner;

public class Array_85 {

    // 15) Write a program in C to find the ceiling in a sorted array?

    public static int ceil(int a[], int val) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (val == a[mid]) {
                return a[mid];
            } else if (val >= a[l] && val < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l < a.length) {
            return a[l];
        } else {
            return -1;
        }

    }

    public static int floor(int a[], int val) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (val == a[mid]) {
                return a[mid];
            } else if (val >= a[l] && val < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l < a.length) {
            return a[h];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a[] = new int[size + 1];

        System.out.println("Enter the elements in array : ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value to ceil search : ");
        int val = sc.nextInt();

        int ceil = ceil(a, val);
        System.out.println("ceil(" + val + ")" + " : " + ceil);
        System.out.println();
        int floor = floor(a, val);
        System.out.println("floor(" + val + ")" + " : " + floor);
        sc.close();
    }
}
