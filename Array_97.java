import java.util.Scanner;

public class Array_97 {

    public static int lengthAlternateEvenOdd(int a[]) {
        int count = 1;
        int max = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i - 1] % 2 != 0 || a[i] % 2 != 0 && a[i - 1] % 2 == 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
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

        int max = lengthAlternateEvenOdd(a);
        System.out.println("The lenegth of maximum length of alternate even odd is : " + max);
        sc.close();
    }
}
