import java.util.Scanner;

public class Array_72 {

    // Find maximum subArray sum by o(n3);

    public static void SubArraySum(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                    max = Math.max(max, sum);

                }

            }

        }
        System.out.println(max);

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

        SubArraySum(a);
        // System.out.println("Sum = " + sum);
        sc.close();
    }
}
