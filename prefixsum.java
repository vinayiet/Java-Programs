public class prefixsum {
    public static void maxSum(int arr[]){
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        // here we define a new array for storing the sum of the prefix 
        int prefix[] = new int[arr.length];
      for(int i = 1; i <= arr.length-1; i++){
        //here we add prefix of the array
        prefix[i]= prefix[i-1]+arr[i];


      }
      for(int i = 0; i <= arr.length-1; i++){
        int start = i;
        for(int j = i; j <= arr.length-1; j++){
          int end = j;
          currentSum = start == 0 ?prefix[end]:  prefix[end] - prefix[start-1];
   
          if(max < currentSum){
            max = currentSum;
          }


        }
      }
      System.out.println("The max sum : "+max);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        maxSum(arr);

    }
    
}
