import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome: ");
        int num = sc.nextInt();
        checkPalindrome(num);
        sc.close();
    }

    public static void checkPalindrome(int num) {
        int originalNumber = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (originalNumber == rev) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome number.");
        }
    }

}
