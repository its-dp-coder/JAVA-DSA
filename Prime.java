import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Prime: ");
        int num = sc.nextInt();
        sc.close();
        checkPrime(num);
    }

    public static void checkPrime(int num) {
        int count = 2;
        int sqrt = (int) Math.sqrt(num);

        while (count <= sqrt) {
            {
                if (num % count == 0) {
                    System.out.println(num + " is not a Prime number.");
                    return;
                }

                count++;
            }
            System.out.println(num + " is a Prime number.");

        }

    }
}
