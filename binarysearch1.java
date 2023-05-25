import java.util.Scanner;

public class binarysearch1{
    public static int search(int arr[], int element){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            for(int i = 0; i <= arr.length; i++){
                int mid = (start + end)/2;
                if(arr[mid] == element){
                    return mid;

                }
                if(arr[mid] < element){
                    start = mid +1;
                }
                if( arr[mid] > element){
                    end = mid - 1;
                }
            }
          
        }
        //it returns -1 because no element is found in the array
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {12,13,14,15,16,17,18,19,20};
        System.out.println("Enter the element which is to be search: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int index = search(arr, element);
       if(index == -1){
        System.out.println("The element not found.");

       }
       else{
        System.out.println("The element found at :"+ search(arr, element));
       }
        
    }
}