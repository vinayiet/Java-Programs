public class xpowern {
    private static Object calculatepower;
    //power of X with the stack height n..............
    public static int calculatepower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowrnm1=calculatepower(x, n-1);
        int xpowern=x*xpowrnm1;
        
        return xpowern;

    }
    public static void main(String[] args){
    int n=5 ;
    int x=2;
  int ans=calculatepower( x, n);
  System.out.println(ans );
    }
    
}
