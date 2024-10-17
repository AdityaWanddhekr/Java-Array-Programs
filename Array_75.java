import java.util.Scanner;

public class Array_75 {

    // Find max subarray sum by sliding window technique.

    public static int slidingWindow(int a[], int k) {
        // int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = k; i < a.length; i++) {
            max -= a[i - k] + a[i];
            // max = Math.max(max, sum);

        }
        return max;
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

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int max = slidingWindow(a, k);
        System.out.println("The maximum subArray sum by size k is : " + max);
        sc.close();
    }
}
