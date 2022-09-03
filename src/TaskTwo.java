import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of product A = ");
        double priceProdA = in.nextDouble();
        System.out.print("Enter the amount of product A = ");
        int amountProdA = in.nextInt();
        double discountProdAB = 0.9;
        System.out.print("Enter the price of product B = ");
        double priceProdB = in.nextDouble();
        System.out.print("Enter the amount of product B = ");
        int amountProdB = in.nextInt();
        double resultPrice = priceProdA * amountProdA + priceProdB * amountProdB;
        if (amountProdA > 0 && amountProdB > 0) {
            double resultWithoutDiscount = resultPrice;
            resultPrice *= discountProdAB;
            System.out.println("Final price of products with discount = " + resultPrice);
            System.out.println("Final price of products without discount = " + resultWithoutDiscount);
        } else {
            System.out.println("Final price of products without discount = " + resultPrice);
        }
        in.close();
    }
}
