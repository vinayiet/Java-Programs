import java.util.Scanner;

public class evensum {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number for sum:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;  i <= n; i++){
            if( i % 2 == 1){
                continue;
            }
            sum = sum +i;
        }
        System.out.println("The sum is:"+sum);
    }
    
}
