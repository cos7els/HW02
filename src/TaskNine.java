public class TaskNine {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 0;
        int k = 9;

        z = x * x + y * y;
        System.out.println("x * x + y * y = " + z);

        z = x * x * x;
        System.out.println("x * x * x = " + z);

        k = x / z; //Потеря дробной части
        System.out.println("x / z = " + k);

        double result = (double) x / z;
        System.out.println("x / z = " + result);
    }
}
