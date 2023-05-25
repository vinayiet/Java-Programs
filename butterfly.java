import java.util.Scanner;

public class butterfly {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the butterlfy which you want to print:");
         int n = sc.nextInt();
        
         // for the first half of the pattern 
         for(int i = 1; i <= n; i++){
            // for printing star + space + star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
        
           // for the second half of the pattern 
           for(int i = n; i >= 1; i--){
            // for printing star + space + star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
        
    }
    
}
