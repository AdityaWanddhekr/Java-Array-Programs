import java.util.Scanner;

public class Array_44 {
    // find the last occurance of the element in array.

    public static int LastOccurance(int a[], int ele) {
        int position = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                position = i;
            }
        }
        return position;
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

        System.out.println("Last Occureance : " + LastOccurance(a, ele));
        sc.close();
    }
}
