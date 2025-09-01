import java.util.Arrays;
import java.util.Scanner;

public class SieveAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Prime: ");
        int num = sc.nextInt();

        sc.close();
        sieveAlgorithm(num);
    }

    public static void sieveAlgorithm(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter <= num) {
            if (arr[counter] == true) {

                for (int factor = counter * 2; factor <= num; factor += counter) {
                    arr[factor] = false;
                }

            }
            counter++;
        }
        for (int i = 2; i <= num; i++) {
            if (arr[i] == true) {
                System.out.println(i + " is a Prime number.");
            }
        }

    }

}
