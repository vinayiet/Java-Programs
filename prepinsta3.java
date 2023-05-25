class prepinsta3{
    //program for bubble sort
    //this section is for sorting the array
    public static void  bubblesort(int[] arr){
        int len=arr.length;
        for(int i=0; i<len; i++)
        for(int j=0; j<len-i-1; j++){
            if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
        }
    }
    //this section is for printing the array which is sorted 
    public static void printarray(int[] arr){
        int len=arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
         // System.out.print();
        }
    }
    //this is the main fun where we call the both functions which are created above
    public static void main(String args[]){
        int[] arr={23,12,32,18,16,14};
       
        bubblesort(arr);
        System.out.println("The sorted array is:");
        printarray(arr);

    }
}