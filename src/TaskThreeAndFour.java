import java.util.Scanner;

public class TaskThreeAndFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        double x = in.nextDouble();
        System.out.print("Enter the value of y = ");
        double y = in.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Hypotenuse = " + hypotenuse);
        in.close();
    }
}
