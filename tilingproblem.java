public class tilingproblem {
    public static int choices(int size) {// the size of the floor
        if (size == 0 || size == 1) {
            return 1;
        }
        // kaam
        // vertical
        int fv = choices(size - 1);

        // horizontal arrangement
        int fH = choices(size - 2);

        // for both arrangement
        int total = fv + fH;
        return total;

    }

    public static void main(String args[]) {
        int size = 4;
        System.out.println(choices(size));

    }

}
