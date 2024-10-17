import java.util.Scanner;

public class Array_83 {

    // 12) . Write a program in C to find a pair with given sum in the array.

    public static void sumPair(int a[], int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println("Sum pair indices are : " + i + "," + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a[] = new int[size + 1];

        System.out.println("Enter the elements in array : ");
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter given Sum : ");
        int sum = sc.nextInt();

        sumPair(a, sum);

        sc.close();
    }
}
