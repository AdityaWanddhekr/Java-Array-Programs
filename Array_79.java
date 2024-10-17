import java.util.Scanner;

public class Array_79 {

    // 5). Write a program to enter the 5 values in ascending order and store in
    // array and find out the missing element from array?

    public static void missingElements(int a[]) {
        int freq[] = new int[18];
        for (int i : a) {
            freq[i] = 1;
        }

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                System.out.print(i + " ");
            }
        }

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

        missingElements(a);

        sc.close();

    }
}