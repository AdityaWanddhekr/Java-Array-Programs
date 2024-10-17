import java.util.Scanner;

public class Array_99 {
    public static int[] smaller(int a[]) {
        int arr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) {
                    count++;

                }
            }
            arr[i] = count;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int arr[] = smaller(a);
        System.out.println("smmaler : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }

}
