import java.util.Scanner;




public class missingNum2{
    public static int missing(int arr[], int n){
        int sum1 = n*(n+1)/2;
        int sum = 0;
        for(int i = 0 ; i<=arr.length-1; i++){
            sum = sum+arr[i];
        }
       
        int s = sum1  - sum;
        return s;
    }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("the Entered elements are: "); 
    for(int i = 0; i <= arr.length-1; i++){
        
        arr[i] = sc.nextInt(); 
 }
   int result = missing(arr, n);
    System.out.println("The missing number is : "+result);
 }
} 