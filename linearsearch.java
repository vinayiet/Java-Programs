import java.util.Scanner;

public class linearsearch {
    public static int search(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println("Enter the value which you want to search");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
       int index = search(arr, value);
        if(index == -1 ){
            System.out.println("Element not found .");
        } else{
            System.out.println("Element found at "+index);
        }

    }
}