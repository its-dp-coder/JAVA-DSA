import java.util.Scanner;

public class TrailingZeroFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find trailing zeros in its factorial: ");
        int num = sc.nextInt();
        sc.close();
        findTrailingZeros(num);
    }

    public static void findTrailingZeros(int num) {
        int res = 0;
        for (int i = 5; i <= num; i = i * i) {
            res += num / i;
        }
        System.out.println("Number of trailing zeros in factorial is: " + res);
    }
}
