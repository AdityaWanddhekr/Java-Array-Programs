import java.util.Scanner;

public class Array_96 {

    // Maximum cosecutive one.

    public static int maximumCosecutive(int a[]) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                count = 0;
            } else {
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
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

        int max = maximumCosecutive(a);
        System.out.println("The maximum consecutive is : " + max);
        sc.close();
    }
}
