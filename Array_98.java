import java.util.Scanner;

public class Array_98 {

    // Product of array except self.

    public static int[] productArray(int a[]) {
        int pref[] = new int[a.length];
        int sefix[] = new int[a.length];
        int ans[] = new int[a.length];
        pref[0] = 1;
        sefix[a.length - 1] = 1;
        for (int i = 1; i < a.length; i++) {
            pref[i] = pref[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            sefix[i] = sefix[i + 1] * a[i + 1];
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = sefix[i] * pref[i];
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int arr[] = productArray(a);
        System.out.println("Product array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

}
