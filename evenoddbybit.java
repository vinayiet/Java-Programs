public class evenoddbybit {
    public static void main(String args[]) {
        int n = 10101;
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("The number is even.");

        }
        if ((n & bitmask) == 1) {
            System.out.println("odd");
        }
    }

}
