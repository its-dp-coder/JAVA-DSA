import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        printBits(number);
        // printOddEven(number);
        // int res1= setIthBit(number, 0);
        // printBits(res1);
        // int res2 = toggleIthBit(number, 3);
        // printBits(res2);
        // int res3 = unsetIthBit(number, 0);
        // printBits(res3);

        int res4 = unSetRightMostSetBit(number);
        printBits(res4);
    }

    public static void printBits(int number) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
        System.err.println();
    }

    public static void printOddEven(int number) {

        if (isBitSet(number, 0)) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is Even");
        }
    }

    public static boolean isBitSet(int number, int i) {
        int res = number & (1 << i);
        return (res == 0) ? false : true;
    }

    public static int setIthBit(int number, int i) {
        return number | (1 << i);

    }

    public static int toggleIthBit(int number, int i) {
        return number ^ (1 << i);

    }

    public static int unsetIthBit(int number, int i) {
        return number & (~(1 << i));

    }

    public static void isCheckingPowerOf2(int number) {
        if ((number & (number - 1)) == 0) {
            System.out.println("Number is power of 2");
        } else {
            System.out.println("Number is not power of 2");
        }
    }

    public static int unSetRightMostSetBit(int num) {
        return (num & num - 1);
    }
}
