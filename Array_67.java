import java.util.*;

public class Array_67 {

    // Duplicate element in array.

    public static void duplicateElement(int a[]) {

        boolean isFound = false;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    isFound = true;
                }
            }

        }
        if (isFound == false) {
            System.out.println("There is no duplicate elemnt in array !.");
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
        System.out.println("Duplicate elements are : ");
        duplicateElement(a);

        sc.close();
    }
}