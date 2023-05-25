import java.util.Scanner;

public class iseven {
    public static boolean even(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println(even(n));
         
    }
    
}
