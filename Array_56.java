import java.util.Scanner;

public class Array_56 {

    // Sort 0 and 1 in array.
    public static void sortoneAndzero(int a[]) {
        int zero = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zero++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < zero) {
                a[i] = 0;
            } else {
                a[i] = 1;
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

        sortoneAndzero(a);
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
