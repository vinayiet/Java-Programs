public class subarray {
      public static void main(String args[]){
        int ts = 0; 
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length-1;
            for(int i = 0; i<=arr.length-1; i++){
                
                for(int j = i; j<= arr.length-1; j++){
                     
                    for(int k = i; k <= j; k++){
                        System.out.print(arr[k]);
                    }
                    System.out.println();
                  ts++;  
                }
               System.out.println();
            }
            System.out.println("total subrray is :  "+ts);
        }
        
      }

    

