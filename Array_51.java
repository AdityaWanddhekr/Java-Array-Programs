import java.util.Scanner;

public class Array_51 {

    // count the number of triplets whose sum is equal to given value is x.

    public static int tripletsSum(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        count++;
                        System.out.println("{" + a[i] + "," + a[j] + "," + a[k] + "}");
                    }
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

        int triplets = tripletsSum(a, num);

        System.out.println("The triplets are : " + triplets);

        sc.close();
    }
}
