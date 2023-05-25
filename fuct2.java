import java.util.Scanner;

public class fuct2 {
    public static int findfact(int n){
        int fact =1;
        for(int i = n; i >= 1; i--){
           
            fact *= i;
          
        }
        return fact;

    }
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int result =findfact(n);
   System.out.println(result);
    }
    
}
