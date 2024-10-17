import java.util.Scanner;

public class Array_50 {

    // total pair in array whose sum is equal to value of x.

    public static int totalPair(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    count++;
                }
            }
        }
        return count;
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

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int totalPair = totalPair(a, num);
        System.out.println("The total pairs are : " + totalPair);
        sc.close();
    }
}