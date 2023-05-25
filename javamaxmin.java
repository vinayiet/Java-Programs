import java .util.*;
public class javamaxmin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements to find the max and min among the list :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
       
        int largest=arr[0];// initialize largest element 
        int smallest=arr[0];// initialise smallest element
        for(int i=1; i<arr.length; i++){
            //here we compare from index zero to a[i] from largest and smallest one by one 
            if(arr[i]>largest){
                largest=arr[i];
            
            }
            //here we compare the smallest element to a[i]
            else if(arr[i]<smallest){
               smallest =arr[i];
            }
        }
        System.out.println("The largest element is :- "+largest);
        System.out.println("The smallest element is :- "+smallest);
    }
}
    

