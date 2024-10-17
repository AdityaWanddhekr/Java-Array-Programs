import java.util.Scanner;

public class Array_53 {

    // Rotate array by its kth steps.

    public static int[] roatateArray(int a[], int k) {
        k = k % a.length;
        int ans[] = new int[a.length];
        int j = 0;
        for (int i = a.length - k; i < a.length; i++) {
            ans[j++] = a[i];
        }
        for (int i = 0; i < (a.length - k); i++) {
            ans[j++] = a[i];
        }

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

        System.out.println("Enter the k to rotate : ");
        int k = sc.nextInt();

        int ans[] = roatateArray(a, k);
        System.out.println();
        System.out.println("Rotated array is : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
