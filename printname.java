
import java.util.*;
class printname{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The stored elements are:");
     for(int i=0; i<=n; i++){
        System.out.print(arr);
     } 
        
    }
}