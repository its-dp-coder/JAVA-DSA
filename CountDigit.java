import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to count a digits: ");
        int num = sc.nextInt();
        countDigit(num);
        sc.close();
    }

    public static void countDigit(int num) {
        int count = 0;
        if (num == 0) {
            System.out.println("Total digits: 1");
            return;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total digits: " + count);
    }

}
