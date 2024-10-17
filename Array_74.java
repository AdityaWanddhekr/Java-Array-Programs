import java.util.Scanner;

public class Array_74 {

    // Maximum subarray sum by size k;

    public static int subArraySumk(int a[], int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < (a.length - k); i++) {

            for (int j = i; j < k; j++) {
                sum += a[i];
                max = Math.max(max, sum);
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

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int max = subArraySumk(a, k);
        System.out.println("The maximum subArray sum by size k is : " + max);
        sc.close();
    }
}
