import java.util.Scanner;

public class squarepattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print square:");
        int n = sc.nextInt();
        for( int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
