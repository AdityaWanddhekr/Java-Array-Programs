import java.util.*;

public class Array_60 {

    // Prefix Sum problem solving with prefix array.
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] prefixSum(int a[]) {
        int pref[] = new int[a.length];
        pref[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            pref[i] = pref[i - 1] + a[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element in array  : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int ans[] = prefixSum(a);
        System.out.println("The prefix sum array is : ");
        print(ans);
        sc.close();
    }
}