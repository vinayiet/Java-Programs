import java.util.*;
public class atmmachine {
  
    public static void main(String[] agrs){
        System.out.println("Enter your Atm pin ");
       
       // int intArray[];
        //intArray= new int[20000];
     System.out.println("Automatic tailer machine");
     System.out.println("Press 1 for balance enquiry.");
     System.out.println("Press 2 for cash withdrawl.");
     System.out.println("Press 3 for depsit balance.");
     System.out.println("Press 4 for Exit.");
     //take input from the user to perform any operation
    Scanner sc=new  Scanner(System.in);
    int button=sc .nextInt();
     
     int balance=50000;
     
     
     
    switch(button)
    {
        case 1: System.out.println("Your bank balance is");
                System.out.print(balance);
        break;
        case 2:System.out.println("Enter the amount to withdraw");
        int withdrawl=sc.nextInt();
        
        int restbalance=balance-withdrawl;
        System.out.println("Your account balance is:");
        System.out.print(restbalance);
        break;
        case 3:System.out.println("Deposit your money:");
        int deposit=sc.nextInt();
        
        int afterdeposit=balance+deposit;
        System.out.println("Your balance is");
        System.out.println(afterdeposit);
        System.out.println("Press any key to exit");
        break;
        case 4:System.out.println("thank you for using atm.");
        break;
        default: System.out.println("Thank you for Visiting our ATM,Visit again");
    }


    }
    
}
