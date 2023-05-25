public class lengthofstring {
    // length of string using java
    public static int leng(String str) {
        // base case
        if (str.length() == 0) {
            return 0;
        }
        //
        return leng(str.substring(1)) + 1;

    }

    public static void main(String args[]) {
        String str = "absbd";
        System.out.println(leng(str));

    }

}
