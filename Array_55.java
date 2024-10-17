import java.util.Scanner;

public class Array_55 {

    // Print yes if the number present in array using frequency array.

    public static int[] makeFrequencyArray(int a[]) {
        int ferq[] = new int[10005];
        for (int i = 0; i < a.length; i++) {
            ferq[a[i]]++;
        }
        return ferq;
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

        int ferq[] = makeFrequencyArray(a);
        System.out.println("Enter the queries : ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the number to be searched : ");
            int num = sc.nextInt();

            if (ferq[num] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            q--;
        }
        sc.close();
    }
}
