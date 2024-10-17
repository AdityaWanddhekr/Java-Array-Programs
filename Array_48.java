import java.util.Scanner;

public class Array_48 {

    // second largest element without sorting.

    public static int kthLarge(int a[]) {
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                slarge = large;
                large = a[i];
            }
        }
        return slarge;
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

        System.out.println("Second large : " + kthLarge(a));
        sc.close();
    }
}
