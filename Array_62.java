import java.util.Scanner;

public class Array_62 {
    // Equal subArrays.

    public static int totalSum(int a[]) {
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            totalSum += a[i];

        }
        return totalSum;
    }

    public static boolean equalSubarray(int a[]) {
        int totalSum = totalSum(a);
        int prefix = 0;
        for (int i = 0; i < a.length; i++) {
            prefix += a[i];
            int suffix = totalSum - prefix;
            if (suffix == prefix) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element in array  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is equal sunArray: " + equalSubarray(a));
        sc.close();
    }
}
