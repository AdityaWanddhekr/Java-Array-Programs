import java.util.Scanner;

public class Array_52 {
    // find unique elemnt in array.

    public static int uniqueEle(int a[]) {

        int ans = -1;
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                ans = a[i];
            }
        }
        return ans;
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

        int ele = uniqueEle(a);
        System.out.println("Unique element is : " + ele);
        sc.close();
    }
}
