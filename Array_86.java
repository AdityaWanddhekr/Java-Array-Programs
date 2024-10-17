import java.util.Scanner;

public class Array_86 {

    public static void nextGreater(int a[]) {
        int k = 1;
        int i = 0;
        while (i < a.length) {
            while (k < a.length) {
                if (a[k] > a[i]) {
                    System.out.println(a[i] + "'s next greater element is : " + a[k]);
                    break;
                }

                k++;
            }
            if (a[i] == a.length) {
                System.out.println(a[a.length - 1] + "'s next greater element is : " + -1);
            }

            i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the element in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        nextGreater(a);
        sc.close();
    }
}