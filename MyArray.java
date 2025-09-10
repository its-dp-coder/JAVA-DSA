import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements " + i + " of array: ");
            arr[i] = sc.nextInt();
        }
        printArray(arr, sz);
        insertAtAnyPos(arr, 1, 99);
        printArray(arr, sz);
        delete(arr, 1);
        printArray(arr, sz);
        sc.close();
    }

    public static void printArray(int arr[], int sz) {
        for (int i = 0; i < sz; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static void insertAtAnyPos(int arr[], int pos, int ele) {
        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Invalid Position");
            return;
        }
        // Shiffting towarda the end
        for (int i = size - 2; i >= pos; i--) {
            System.out.println(i);
            arr[i + 1] = arr[i];
        }
        arr[pos] = ele;

    }

    public static void delete(int arr[], int pos) {
        // Shiffting Towards starting index
        for (int i = pos; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

}
