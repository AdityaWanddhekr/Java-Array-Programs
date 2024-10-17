import java.util.Scanner;

public class Array_63 {
    // sum between range in array.

    public static int[] prefixArray(int a[]) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size + 1];
        System.out.println("Enter the element in array  : ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int prefis[] = prefixArray(a);

        System.out.println("Enter the no of quries : ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = prefis[r] - prefis[l - 1];
            System.out.println("The sum in rabge is : " + sum);

            q--;
        }
        sc.close();
    }
}
