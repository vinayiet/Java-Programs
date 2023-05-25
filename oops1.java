
 public class oops1 {
    //method of overlaoding is when many method have the same name and perform different functions
    public static  int sum(int x,int y){
        return (x+y);
        
    }
    //the overloaded sum takes parameter three
    public static int sum(int x,int y, int z){
        return (x+y+z);
    }
    //the overloaded sum takes parameter four
    public static int sum(int x,int y, int z, int w){
        return (x+y+z+w);
    }
    public static void main(String args[]){
      //Sum s=new Sum();
      System.out.println(sum(10,30));
      System.out.println(sum(10, 20,30));
      System.out.println(sum(10,20,40,30));
    }

    
}
