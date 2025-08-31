import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong: ");
        int num = sc.nextInt();
        checkArmstrong(num);
        sc.close();
    }

    public static void checkArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

}
