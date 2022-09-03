public class TaskTen {
    public static void main(String[] args) {
        int resultInt = 0;
        double resultDouble = 0;
        for (int i = 0; i < 10; i++) {
            resultInt += i;
            resultDouble += i;
        }
        resultInt /= 10; //Потеря дробной части
        resultDouble /= 10;
        System.out.println("The int AVG = " + resultInt);
        System.out.println("The double AVG = " + resultDouble);
    }
}
