import java.util.Scanner;

public class Array_100 {

    public static int searchPosition(int a[], int val) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == val) {
                return mid;
            } else if (val >= a[l] && val < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        if (val == 0) {
            return 0;
        }

        return l;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");// Array 1
        int size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter array element  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the val : ");
        int val = sc.nextInt();

        int posi = searchPosition(a, val);
        System.out.println("Position is : " + posi);

        sc.close();
    }
}
