 class stringbuilder1 {
    public static void main(String args[]){
        //string builder format for string
        StringBuilder sb=new StringBuilder();
        sb.append("GFG");
        System.out.println("String= "+ sb);

        ///we will use NEW STRING print them
        StringBuilder ab=new StringBuilder("ABABAAA");
        System.out.println("String1 =" +ab);
 
        //now we will find out the string capacity of the given string 
        System.out.println("The capacity of the string is:"+ ab.capacity());
        
    }
    
}
