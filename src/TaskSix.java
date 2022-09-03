import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = in.nextInt();
        numberSum(x);
    }

    public static void numberSum(int x) {
        int result = (x / 100) + ((x % 100) / 10 + ((x % 100) % 10));
        System.out.println("Sum of numbers = " + result);
    }
}
