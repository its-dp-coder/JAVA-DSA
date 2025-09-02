import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        sc.close();
        findFactorial(num);
    }

    public static void findFactorial(int num) {
        double res = 1;
        // while (num > 1) {
        // res *= num;
        // num--;
        // }
        // System.out.println("Factorial is: " + res);
        for (int i = num; i > 1; i--) {
            res = res * i;
        }
        System.out.println("Factorial is: " + res);
    }
}
