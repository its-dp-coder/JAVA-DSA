import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its divisors: ");
        int num = sc.nextInt();
        findDivisor(num);
        sc.close();
    }

    public static void findDivisor(int num) {
        int count = 1;
        int sqrt = (int) Math.sqrt(num);
        while (count <= sqrt) {
            if (num % count == 0) {
                System.out.println(count + " Divisor of " + num);
                int otherDivisor = num / count;
                if (otherDivisor != count) {
                    System.out.println(otherDivisor + " Divisor of " + num);
                }
            }
            count++;
        }
    }

}
