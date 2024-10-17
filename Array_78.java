import java.util.Scanner;

public class Array_78 {

    // Trapping Rain Water.

    public static int trapedWater(int a[]) {
        // find leftMax.
        int leftMax[] = new int[a.length];
        leftMax[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }

        // find rightMax.
        int rightMax[] = new int[a.length];
        rightMax[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }

        // find water level.
        int trapedWater = 0;
        for (int i = 0; i < a.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapedWater += waterlevel - a[i];
        }
        return trapedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the element of array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int trapedWater = trapedWater(a);
        System.out.println("The traped water is : " + trapedWater);
        sc.close();
    }
}
