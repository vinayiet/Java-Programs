class prepinsta1{
    
public static void linearsearch(int[] arr, int item){
    for(int i=0; i<arr.length; i++)
    {
        try{
        if(arr[i]==item)
        {
            System.out.println("item found at index"+i);
            return;
        }
    }
    catch(Exception e){
        System.out.println("an exception found");
    }
    }
    System.out.println("Item not found ");
 
}

    public static void main(String args[]){
        int[] arr={22,33,4,35,67,87,65};
        int item=33;
        linearsearch(arr, item);
        
}}
/* 
class prepinsta1 {

    private static void LinearSearch(int[] arr, int item) {

        for(int i=0;i <arr.length;i++){
            if(arr[i] == item)
            {
                System.out.println(item + " Found at index : " + i);
                return;
            }
        }
        System.out.println("Not found");

    }

    public static void main(String args[]) {
        int[] arr = {12, 5, 18, 25, -3, 19};

        int item = 25;
        LinearSearch(arr, item);
    }
}*/

