import java.util.*;

public class Array_45 {

    // Count number of element strctly greater than x.

    public static int GreaterEle(int a[], int ele) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > ele) {
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

        int greater = GreaterEle(a, ele);
        System.out.println("Total strictly Greater elements are : " + greater);

        sc.close();
    }
}
