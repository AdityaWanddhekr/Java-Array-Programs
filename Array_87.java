import java.util.Scanner;

public class Array_87 {

    // 19) Write a program in C to find two elements whose sum is closest to zero.

    public static void closeTozero(int a[]) {
        int sum = 0;
        int i = 0;
        int j = a.length - 1;
        int min = Integer.MAX_VALUE;

        while (i < j) {
            {
                sum += a[i] + a[j];
                min = Math.min(sum, min);
                i++;
                j--;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the element in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        closeTozero(a);
        sc.close();
    }
}
