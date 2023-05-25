import java.util.Scanner;

public class printnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to print :");
        int n = sc.nextInt();
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num++;
        }
    }
    
}
