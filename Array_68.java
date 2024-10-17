import java.util.Scanner;

public class Array_68 {

    // Find unique element in array.

    public static void uniqueElement(int a[]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;

                }

            }
            if (a[i] > 0) {
                System.out.print(a[i] + " ");

            }

        }

    }

    public static void printf(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

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

        System.out.println("Array is : ");
        printf(a);
        System.out.println();
        System.out.println("Unique elements are : ");
        uniqueElement(a);
        sc.close();
    }
}
