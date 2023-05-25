import java.util.Scanner;

public class charprint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'a';
        
        for(int line = 1 ; line <= n;  line++){
                for(int chars = 1; chars <= line; chars++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
        }
    }
    
}
