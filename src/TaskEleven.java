import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for convert = ");
        int x = in.nextInt();
        System.out.print("Choose the numeral system: 2, 3, 4, 5, 6, 7, 8, 16");
        int numeralSystem = in.nextInt();
        switch (numeralSystem) {
            case(2):
                break;
        }
        in.close();
        decimalToBinary(x);
        decimalToTernary(x);
        decimalToQuaternary(x);
        decimalToQuinary(x);
        decimalToSenary(x);
        decimalToOctal(x);
        System.out.println(decimalToHex(x));
    }

    public static String decimalToBinary(int decNumber) {
        StringBuilder binNumber = new StringBuilder();
        while (decNumber > 0) {
            binNumber.append(decNumber % 2);
            decNumber /= 2;
        }
        return binNumber.reverse().toString();
    }

    public static void decimalToTernary(int decNumber) {
        StringBuilder terNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber > 0) {
            terNumber.append(decNumber % 3);
            decNumber /= 3;
        }
        resultBinNumber = Integer.parseInt(terNumber.reverse().toString());
        System.out.println("In ternary numeral system = " + resultBinNumber);
    }

    public static void decimalToQuaternary(int decNumber) {
        StringBuilder quatNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber > 0) {
            quatNumber.append(decNumber % 4);
            decNumber /= 4;
        }
        resultBinNumber = Integer.parseInt(quatNumber.reverse().toString());
        System.out.println("In quaternary numeral system = " + resultBinNumber);
    }

    public static void decimalToQuinary(int decNumber) {
        StringBuilder quinNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber > 0) {
            quinNumber.append(decNumber % 5);
            decNumber /= 5;
        }
        resultBinNumber = Integer.parseInt(quinNumber.reverse().toString());
        System.out.println("In quinary numeral system = " + resultBinNumber);
    }
    public static void decimalToSenary(int decNumber) {
        StringBuilder senNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber > 0) {
            senNumber.append(decNumber % 6);
            decNumber /= 6;
        }
        resultBinNumber = Integer.parseInt(senNumber.reverse().toString());
        System.out.println("In senary numeral system = " + resultBinNumber);
    }
    public static void decimalToOctal(int decNumber) {
        StringBuilder octalNumber = new StringBuilder();
        int resultBinNumber;
        while (decNumber > 0) {
            octalNumber.append(decNumber % 8);
            decNumber /= 8;
        }
        resultBinNumber = Integer.parseInt(octalNumber.reverse().toString());
        System.out.println("In octal numeral system = " + resultBinNumber);
    }
    public static String decimalToHex(int decNumber) {
        StringBuilder binaryNumber = new StringBuilder(decimalToBinary(decNumber));
        StringBuilder binaryTempNumber = new StringBuilder();
        StringBuilder hexNumber = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            binaryTempNumber.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            binaryTempNumber.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            binaryTempNumber.append("0").append(binaryNumber);
        } else {
            binaryTempNumber.append(binaryNumber);
        }
        for (int i = 0; i < binaryTempNumber.length(); i += 4) {
            String octet = binaryTempNumber.substring(i, i + 4);
            if (octet.equals("0000")) {
                hexNumber.append("0");
            } else if (octet.equals("0001")) {
                hexNumber.append("1");
            } else if (octet.equals("0010")) {
                hexNumber.append("2");
            } else if (octet.equals("0011")) {
                hexNumber.append("3");
            } else if (octet.equals("0100")) {
                hexNumber.append("4");
            } else if (octet.equals("0101")) {
                hexNumber.append("5");
            } else if (octet.equals("0110")) {
                hexNumber.append("6");
            } else if (octet.equals("0111")) {
                hexNumber.append("7");
            } else if (octet.equals("1000")) {
                hexNumber.append("8");
            } else if (octet.equals("1001")) {
                hexNumber.append("9");
            } else if (octet.equals("1010")) {
                hexNumber.append("A");
            } else if (octet.equals("1011")) {
                hexNumber.append("B");
            } else if (octet.equals("1100")) {
                hexNumber.append("C");
            } else if (octet.equals("1101")) {
                hexNumber.append("D");
            } else if (octet.equals("1110")) {
                hexNumber.append("E");
            } else if (octet.equals("1111")) {
                hexNumber.append("F");
            }
        }
        return hexNumber.toString();
    }
}
