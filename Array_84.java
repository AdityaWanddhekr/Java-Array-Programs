import java.util.Arrays;
import java.util.Scanner;

public class Array_84 {

    // 13) Write a program in C to find the majority element of an array ?

    public static void findMajority(int a[]) {
        Arrays.sort(a);
        int freq = 1;
        int i = 1;
        while (i < a.length) {

            while (i < a.length && a[i] == a[i - 1]) {
                freq++;
                i++;

            }

            if (a.length == 1 || freq >= (a.length / 2)) {
                System.out.println("The majority elemeny is " + a[i]);

            }

            freq = 1;
            i++;
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

        findMajority(a);
        sc.close();
    }
}
