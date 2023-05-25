public class largestarray {
    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;// this value signify the -infinity
        for(int i = 0; i <= arr.length-1; i++){
            if(large < arr[i]){
                large = arr[i];

                
            }
        }
        return large;
    }
    public static void main(String args[]){
 int arr[] = {1,3,4,5,10};
 int result= largest(arr);
 System.out.println("The largest number is: "+result);
    }
    
}
