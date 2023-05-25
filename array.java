import java.util.*;
public class array {
    public static final int length = 0;

    //linear search program
    public static void main(String[] agrs){
            System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] array=new int[n];
       System.out.println("The elements stored are:");
       for(int i=0; i<n; i++)
       {
        array[i]=sc.nextInt();
       }
       System.out.println("Enter the element to search :");
     int x=sc.nextInt();       
       for(int i=0; i<n; i++)
       {
       if(x==array[i])
       {
        System.out.println("The element found at index :"+array[i]);
       }
      
       } 
       
    }
    
}
