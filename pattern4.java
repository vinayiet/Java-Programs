public class pattern4 {
    public static void main(String[] agrs){
    //outer loop 
    for(int i=1; i<=4; i++){
        // inner loop for space print
    for(int j=1; j<=4-i; j++)
    { 
        System.out.print(" ");
    }
    //inner loop for * print

for(int j=1; j<=i; j++){
    System.out.print("*");
}
System.out.println();
}
}
}