import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        double x = in.nextDouble();
        round(x);
    }
    public static void round(double x) {
        int result = (x % 1) >= 0.5 ? (int) (x += (1 - (x % 1))) : (int) (x -= (x % 1));
        System.out.println("The rounded value of x = " + result);
    }
}
