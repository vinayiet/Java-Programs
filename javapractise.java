import java.util.*;
public class javapractise {
    /**
     * @param args
     */
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array to store:");
        int n=sc.nextInt();
        System.out.println("The stored elements are:");

    int my_array[] = new int[n];
    
    for(int i=0; i<n; i++)
    {
        my_array[i] = sc.nextInt();
    }
    int sum = 0;
    
    for (int i : my_array){
        sum += i;
        
    }
    System.out.println("the sum is:"+sum);
    }}

    