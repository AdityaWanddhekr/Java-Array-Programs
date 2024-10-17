import java.util.Scanner;

public class Array_69 {

    // Remove duplicate in array with new array.

    public static int[] removeDuplicate(int a[]) {
        int rd[] = new int[a.length];
        int k = 0;
        rd[k] = a[0];
        for (int i = 0; i < a.length; i++) {

            if (rd[k] != a[i]) {
                k++;
                rd[k] = a[i];
            }
        }
        return rd;
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

        int rd[] = removeDuplicate(a);
        System.out.println("The array after removing duplicates : ");
        for (int i = 0; i < rd.length; i++) {
            if (rd[i] != 0) {
                System.out.print(rd[i] + " ");
            }
        }

        sc.close();
    }
}
