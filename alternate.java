import java.util.Scanner;

public class alternate {
    public static void main(String aString[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for( int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            if( (i+j) % 2 == 1){
                System.out.print("0");
            } else{
                System.out.print("1");
            }
        }
        System.out.println();
       }

    }
    
}
