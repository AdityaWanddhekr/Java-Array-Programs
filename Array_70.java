import java.util.Scanner;

public class Array_70 {

    // Remove Duplicate in array without creating new array.

    public static int removeDuplicate(int a[]) {
        int k = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[k] != a[i]) {
                k++;
                a[k] = a[i];
            }
        }
        return k;
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

        int k = removeDuplicate(a);
        System.out.println("The  array after remove duplicate  : ");
        for (int i = 0; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
