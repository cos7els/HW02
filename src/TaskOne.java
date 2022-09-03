import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of product A = ");
        double priceProdA = in.nextDouble();
        System.out.print("Enter the amount of product A = ");
        int amountProdA = in.nextInt();
        System.out.print("Enter the discount of product A % = ");
        double discountProdA = (100 - in.nextDouble()) / 100;
        System.out.print("Enter the price of product B = ");
        double priceProdB = in.nextDouble();
        System.out.print("Enter the amount of product B = ");
        int amountProdB = in.nextInt();
        double resultPrice = priceProdA * discountProdA * amountProdA + priceProdB * amountProdB;
        System.out.println("Final price of products with discount = " + resultPrice);
        in.close();
    }
}
