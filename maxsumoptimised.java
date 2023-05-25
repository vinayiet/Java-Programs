public class maxsumoptimised {
    public static void sum(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
           

        }
        System.out.println("The maximum sum is: "+maxSum);
    }
    public static void main(String args[]){
        int arr[] = { 1,-2, -3, 4, 5};
        sum(arr);

    }
    
}
