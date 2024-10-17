import java.util.Scanner;

public class Array_95 {

    // Leader in array.

    public static void leader(int a[]) {
        int c = a[a.length - 1];
        System.out.println("Leader is : ");
        System.out.print(c);
        System.out.println();
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > c) {
                c = a[i];
                System.out.println(c);
            }
        }

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

        leader(a);
        sc.close();
    }

}
