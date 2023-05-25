import java.util.Scanner;

public class binomailcoffiecient {
    public static int binomial(int n,int r){
        int fact = 1;
        int rfact = 1;
        int nrfact = 1;
        for(int i = n; i >= 1; i--){

            fact *= i;
        }
        for(int i = r; i >= 1; i--){

            rfact *= i;
        }
        for(int i = (n-r); i >= 1; i--){

            nrfact *= i;
        }
        return fact/(rfact*nrfact);

    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
     int n = sc.nextInt();
     System.out.println("Enter the value of r: ");
     int r = sc.nextInt();
     int coff =binomial(n, r);
     System.out.println("The coffiecient is: "+coff);
    }
    
}
