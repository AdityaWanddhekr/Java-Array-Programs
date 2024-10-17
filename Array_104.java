import java.util.Scanner;

public class Array_104 {

    public static int maxProfit(int price[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of the array : ");
        int size = sc.nextInt();

        int price[] = new int[size];

        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }

        System.out.println("The price are : ");
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i] + " ");
        }

        int max = maxProfit(price);
        System.out.println("The maximum profit is : " + max);
        sc.close();
    }
}