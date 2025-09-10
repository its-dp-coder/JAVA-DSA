import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int sz = sc.nextInt();
        int arr[] = new int[sz];
        System.out.println("Enter Elements are in the Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " Elements");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Elements to be Searched");
        int ele = sc.nextInt();
        // lSearch(arr, ele);
        Multiple(arr, ele);
        sc.close();
    }

    public static void lSearch(int arr[], int ele) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element  Not Found  " + ans);
        } else {
            System.out.println("Elements Found At index " + ans);
        }
    }

    public static void Multiple(int arr[], int ele) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element  Not Found  ");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Elements Found At index " + ans[i]);
            }
        }
    }

}
