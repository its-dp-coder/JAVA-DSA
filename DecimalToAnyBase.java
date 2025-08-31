import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.print("Enter the base to convert: ");
        int base = sc.nextInt();
        convertDecimalToBinary(decimalNumber, base);
        sc.close();
    }

    public static void convertDecimalToBinary(int decimalNumber, int base) {
        int result = 0;
        int power = 0;
        while (decimalNumber > 0) {
            int rem = decimalNumber % base;
            decimalNumber = decimalNumber / base;
            result = result + rem * (int) Math.pow(10, power);
            power++;

        }
        System.out.println("Any representation: " + result);
    }

}
