import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = in.nextInt();
        System.out.print("Enter the value of y = ");
        int y = in.nextInt();
        in.close();
        division(x, y);
    }

    public static void division(int x, int y) {
        double result = (double) x / y;
        System.out.println("The result of x / y = " + result);
    }
}
