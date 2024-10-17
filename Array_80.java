// import java.util.*;

public class Array_80 {

    // // 7) WAP to enter the 10 element array and print the occurrence of every
    // // element ?

    // public static void frequancyArray(int a[]) {

    // int freq = 1;
    // int i = 1;
    // while (i < a.length) {
    // while (i < a.length && a[i] == a[i - 1]) {
    // freq++;
    // i++;
    // }
    // if (freq == 1) {
    // System.out.println(a[i]);
    // }
    // freq = 1;
    // i++;
    // }
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size : ");
        // int size = sc.nextInt();

        // int a[] = new int[size];

        // System.out.println("Enter the element of array : ");
        // for (int i = 0; i < a.length; i++) {
        // a[i] = sc.nextInt();
        // }

        // frequancyArray(a);
        // sc.close();

        int num = 38;
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }
        System.out.println("sum is : " + sum);
    }
}
