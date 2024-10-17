import java.util.Scanner;

public class Array_102 {
    // Sum in range.
    public static int[] prefix(int a[]) {

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

        System.out.println("Enter the element of array : ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int pref[] = prefix(a);
        System.out.println("Enter the quries : ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = pref[r] - pref[l - 1];
            System.out.print("Sum in range : " + sum);
        }
        sc.close();
    }
}
