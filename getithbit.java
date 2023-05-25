public class getithbit {
    public static void main(String args[]) {
        // program to find Ith bit of the given number
        int n = 10;
        int i = 1;
        int bitmask = (1 << i);
        /*
         * if ((n & bitmask) == 0) {
         * System.out.println("0");
         * } else {
         * System.out.println("1");
         * }
         */
        // program for set Ith bit
        // System.out.println(n | bitmask);

        // program for the clear the ith bit
        System.out.println(n & ~bitmask);
    }

}
