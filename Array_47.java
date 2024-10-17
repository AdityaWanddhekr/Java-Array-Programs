import java.util.Arrays;
import java.util.Scanner;

public class Array_47 {

    // Find the first small and last element in array.

    public static int[] smallAndLarge(int a[]) {
        Arrays.sort(a);
        int ans[] = { a[0], a[a.length - 1] };
        return ans;
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

        int ans[] = smallAndLarge(a);
        System.out.println("Sammlest element : " + ans[0]);
        System.out.println("Largest element : " + ans[1]);
        sc.close();
    }
}
