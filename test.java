import java.util.*;
import java.util.Scanner;

public class test {

    public static void main(String args[]) {
        int[] arr = { 5, 3, 8, 9, 5, 2, 2, 2 };

        reverse(arr);
        print(arr);
        // System.out.println(pairsum(arr, sum));
        // System.out.println(arraymanipulation(arr));
        // System.out.println(secondmax(arr));
        // System.out.println(duplicate(arr));

    }

    // public static int arraymanipulation(int[] arr) {

    // int ans = 0;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // arr[i] = -1;
    // arr[j] = -1;

    // }
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > 0) {
    // ans = arr[i];
    // }
    // }
    // return ans;
    // }
    // public static int maximum(int arr[]) {
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // return max;
    // }
// s    tatic int[] reverse(int[] arr) {
//         int i = 0;
//         int j = arr.length - 1;

//         while (i < j) {
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//         return arr;
//     }

//     static void swap(int[] arr, int i, int j) {
//         int temp;
//         temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // // program for the second max of the given array
    // public static int secondmax(int[] arr) {
    // int max = maximum(arr);
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == max) {
    // arr[i] = Integer.MIN_VALUE;
    // }
    // }
    // int ans = maximum(arr);
    // return ans;
    // }
    // public static int duplicate(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; i < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // return arr[i];
    // }
    // }
    // }
    // return -1;
    // }

    public static void rotatearray(int[] arr,int k){
        int n = arr.length;
        int j = 0;
        int[] rotatearray = new int[arr.length];
        for(int i = n - k; i < n - 1; i++){
           rotatearray[j++] = arr[i];

        }
    }
}
