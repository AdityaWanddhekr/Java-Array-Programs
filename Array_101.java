import java.util.*;

public class Array_101 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - k + 1];
        int m = k;
        for (int i = 0; i <= nums.length - m; i++) {

            int max = 0;
            int j = i;

            while (j < k) {
                if (nums[j] > max) {
                    max = nums[j];
                }
                j++;

            }
            k++;
            res[i] = max;
        }
        return res;
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

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int max[] = maxSlidingWindow(a, k);
        System.out.println("The maximum subArray sum by size k is : ");
        for (int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
        }
        sc.close();
    }
}
