import java.util.Scanner;

public class Array_73 {

    // The maximum subarray sum by Kadan's Algorithm.

    public static int sunArraySum(int a[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
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

        int max = sunArraySum(a);
        System.out.println("Maximum subarray sum is : " + max);
        sc.close();
    }
}
