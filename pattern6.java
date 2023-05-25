public class pattern6 {
    public static void main(String[] agrs)
    {

    for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++)
        {    
            int sum = i+j;
            int rem=sum%2;
            if(  rem==0){
                System.out.print(" 1 ");
            } 
            else 
            {
                System.out.print(" 0 ");
            }
        }

        System.out.println();
    }
    }
    
}
