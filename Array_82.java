import java.util.Scanner;

public class Array_82 {

    // 10). Write a program in C to delete an element at desired position from an
    // array.

    public static int[] deleteElement(int a[], int position) {

        for (int i = position; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a[] = new int[size + 1];

        System.out.println("Enter the elements in array : ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the position : ");
        int posi = sc.nextInt();

        int del[] = deleteElement(a, posi);
        System.out.println("Array after delete element is : ");
        for (int i = 1; i < del.length - 1; i++) {
            System.out.print(del[i] + " ");
        }
        sc.close();
    }
}
