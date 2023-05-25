public class maxsumaaray {
    public static void main(String args[]){
        
        int maxSum = Integer.MIN_VALUE;
      
      int arr[] = {1,2,3};
      
          for(int i = 0; i<=arr.length-1; i++){
           
              for(int j = i; j<= arr.length-1; j++){
                int currentSum = 0;
                  for(int k = i; k <= j; k++){
                      currentSum += arr[k];
                  }
                  System.out.println(currentSum);
                  if(currentSum > maxSum){
                    maxSum = currentSum;
                  }
              }
             
          }
          
          System.out.println("The max subarray is:  "+maxSum);
      }
      
    }

  
