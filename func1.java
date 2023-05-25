import java.util.Scanner;

public class func1 {
    public static int calculatesum(int a, int b){
int sum;
        sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

   int result = calculatesum(a, b);
       System.out.println(result);
    }
    
}
