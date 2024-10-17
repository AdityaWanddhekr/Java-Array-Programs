import java.util.Scanner;

public class Array_71 {

    // Print all subArrays.

    public static void printSubArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                }
                System.out.println();

            }
        }
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

        printSubArray(a);
        sc.close();
    }
}
