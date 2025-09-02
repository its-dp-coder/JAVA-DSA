import java.util.Scanner;

public class EculianGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find GCD using Euclidean algorithm: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findGCD(num1, num2);
    }

    public static void findGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        if (num1 == 0) {
            System.out.println("GCD is: " + num2);
        } else {
            System.out.println("GCD is: " + num1);
        }

    }

}
