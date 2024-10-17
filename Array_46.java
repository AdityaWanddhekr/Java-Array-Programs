import java.util.Scanner;

public class Array_46 {

    // chaeck the array is sorted or not.

    public static boolean isSorted(int a[]) {
        boolean isSort = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                isSort = false;
                break;
            }

        }

        return isSort;
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

        boolean sort = isSorted(a);
        System.out.println("The array is sorted : " + sort);
        sc.close();
    }
}
