public class smallestvalue{
    ;
    public static int small(int arr[]){
        
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i <= arr.length-1; i++){
            if(smallest > arr[i]){
                smallest = arr[i];

            }
        }
        return smallest;
    }
    public static void main(String args[]){

        int arr[] = { 23,21,44,56,8,9};
        System.out.println("The smallest num in the array is: "+small(arr));
    }
}