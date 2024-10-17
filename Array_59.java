import java.util.Scanner;

public class Array_59 {

    // make sort array square.

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static int[] squareArray(int a[]) {
        int left = 0;
        int right = a.length - 1;
        int ans[] = new int[a.length];
        int k = 0;
        while (left <= right) {
            if (Math.abs(a[left]) > Math.abs(a[right])) {
                ans[k++] = a[left] * a[left];
                left++;
            } else {
                ans[k++] = a[right] * a[right];
                right--;
            }
        }
        return ans;
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
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

        int ans[] = squareArray(a);
        reverse(ans);
        print(ans);
        sc.close();
    }
}
