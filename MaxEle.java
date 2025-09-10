import java.util.Scanner;

public class MaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int sz = sc.nextInt();
        int arr[] = new int[sz];
        System.out.println("Enter Elements are in the array:");
        for (int i = 0; i < sz; i++) {
            System.out.println("Enter " + i + " Elements");
            arr[i] = sc.nextInt();
        }
        findMax(arr);
        findMinimum(arr);
        sc.close();

    }

    public static void findMax(int arr[]) {
        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Elemnets is in Array: " + max);
    }

    public static void findMinimum(int arr[]) {
        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Elemnets is in Array: " + min);
    }
}
