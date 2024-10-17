import java.util.Scanner;

public class Array_43 {
    // Count number of occurance of a particular element.

    public static int occurance(int a[], int ele) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                count++;
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

        System.out.println("Enter the element : ");
        int ele = sc.nextInt();

        int count = occurance(a, ele);
        System.out.println("Occurance is : " + count);
        sc.close();
    }
}
