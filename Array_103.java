import java.util.Scanner;

public class Array_103 {
    // Renmove Duplicate in array.

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

        int remove = removeDuplicate(a);
        System.out.println("Array after removing duplicates : ");
        for (int i = 0; i <= remove; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
