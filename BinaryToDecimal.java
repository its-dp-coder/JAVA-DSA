import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = sc.nextInt();
        sc.close();
        convertBinaryToDecimal(binaryNumber);
    }

    public static void convertBinaryToDecimal(int binaryNumber) {
        int result = 0;
        int power = 0;
        while (binaryNumber > 0) {
            int unit = binaryNumber % 10;
            binaryNumber = binaryNumber / 10;
            result = result + unit * (int) Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal representation: " + result);
    }

}
