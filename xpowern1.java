public class xpowern1 {
    public static int xpowernlog(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            int xpowern=xpowernlog(x, n/2)*xpowernlog(x, n/2);
            return xpowern;
        }
        else{
            int xpowern=xpowernlog(x, n/2)*xpowernlog(x, n/2)*x;
            return xpowern;
        }
        
    }
    public static void main(String[] args){
         int n=5;
          int x=2;
          int ans=xpowernlog(x, n);
          System.out.println(ans);

         
    }
    
}
