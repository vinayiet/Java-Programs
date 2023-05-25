public class subaray{
    
    public static void subarray(int[] array){
         int len= array.length;
         //t
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                for(int k=i; k<len; k++){
                      System.out.print(array[i]+" ");
                }
                System.out.println();
            }
        }
    }
public static void main(String[] args){
    int[] array={1,2,3,4};
    System.out.println("all the non empty sets:");
     subarray(array);

}
}
    
