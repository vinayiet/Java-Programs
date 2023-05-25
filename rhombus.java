import java.util.Scanner;

public class rhombus {
    public static void main(String args[]){
        int n = 4; 
        for( int i = 1; i <= 4; i++){
            // for printing space
            for(int j = 1; j <= (4 - i); j++){
                System.out.print(" ");
            }
            // for printing star
            for(int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
