import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter " + j + " element");
                arr[i][j] = sc.nextInt();

            }
        }
        print2DArray(arr);

    }

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + " index");
            printArray(arr[i]);
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
}
