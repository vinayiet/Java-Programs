import java.util.Scanner;

public class test21 {

    public static int[] prefixsum(int arr[]) {
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i - 1] + arr[i];

        }
        return arr2;
    }

    public static void print(int arr2[]) {
        for (int i = 0; i < arr2.length - 1; i++) {

            System.out.println(arr2[i] + " ");
        }
    }

    public static void main(String args[]) {
        // program to sum the prefix of the given array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array :");

        int[] arr = new int[n];
        prefixsum(arr);
        print(arr);

    }

}
