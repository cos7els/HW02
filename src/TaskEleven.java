import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for convert = ");
        int x = in.nextInt();
        in.close();
        decimalToBinary(x);
        decimalToTernary(x);
        decimalToQuaternary(x);
        decimalToQuinary(x);
        decimalToOctal(x);
    }
    public static void decimalToBinary(int decNumber) {
        StringBuilder binNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber != 0) {
            binNumber.append(decNumber % 2);
            decNumber /= 2;
        }
        resultBinNumber = Integer.parseInt(binNumber.reverse().toString());
        System.out.println("In binary numeral system = " + resultBinNumber);
    }

    public static void decimalToTernary(int decNumber) {
        StringBuilder terNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber != 0) {
            terNumber.append(decNumber % 3);
            decNumber /= 3;
        }
        resultBinNumber = Integer.parseInt(terNumber.reverse().toString());
        System.out.println("In ternary numeral system = " + resultBinNumber);
    }
    public static void decimalToQuaternary(int decNumber) {
        StringBuilder quatNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber != 0) {
            quatNumber.append(decNumber % 4);
            decNumber /= 4;
        }
        resultBinNumber = Integer.parseInt(quatNumber.reverse().toString());
        System.out.println("In quaternary numeral system = " + resultBinNumber);
    }
    public static void decimalToQuinary(int decNumber) {
        StringBuilder quinNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber != 0) {
            quinNumber.append(decNumber % 5);
            decNumber /= 5;
        }
        resultBinNumber = Integer.parseInt(quinNumber.reverse().toString());
        System.out.println("In quinary numeral system = " + resultBinNumber);
    }

    public static void decimalToOctal(int decNumber) {
        StringBuilder octNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber != 0) {
            octNumber.append(decNumber % 8);
            decNumber /= 8;
        }
        resultBinNumber = Integer.parseInt(octNumber.reverse().toString());
        System.out.println("In octal numeral system = " + resultBinNumber);
    }
}
