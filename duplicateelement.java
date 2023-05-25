class duplicateelment{
    public static void main(String args[]){
        String[] array={ "vinay","tribhuwan", "shivansh","vinay","tribhuwan"};
        for(int i=0; i<=array.length; i++){
            for(int j=i+1; j<=array.length; j++){
            if(array[i].equals(array[j])){
                System.out.println("The duplicate element is:"+array[j]);
            }
            }
        }
    }
}