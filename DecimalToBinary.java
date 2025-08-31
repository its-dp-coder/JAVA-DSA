import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        convertDecimalToBinary(decimalNumber);
        sc.close();
    }

    public static void convertDecimalToBinary(int decimalNumber) {
        int result = 0;
        int power = 0;
        while (decimalNumber > 0) {
            int rem = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            result = result + rem * (int) Math.pow(10, power);
            power++;

        }
        System.out.println("Binary representation: " + result);
    }

}