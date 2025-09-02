import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find LCM: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findGCD(num1, num2);
        findLCM(num1, num2);
    }

    public static int findGCD(int num1, int num2) {
        int gcd;
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        if (num1 == 0) {
            gcd = num2;
        } else {
            gcd = num1;
        }
        return gcd;
    }

    public static void findLCM(int num1, int num2) {
        int lcm = (num1 * num2) / findGCD(num1, num2);
        System.out.println("LCM is: " + lcm);
    }

}
