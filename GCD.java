import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find GCD: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findGCD(num1, num2);
    }

    public static void findGCD(int num1, int num2) {
        int min = (num1 < num2) ? num1 : num2;
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD is: " + min);
                return;
            }
            min--;
        }
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("GCD is: " + max);
    }

}
